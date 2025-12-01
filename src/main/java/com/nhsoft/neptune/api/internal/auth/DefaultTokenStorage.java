package com.nhsoft.neptune.api.internal.auth;

import com.nhsoft.neptune.api.internal.util.JsonUtil;
import com.nhsoft.neptune.api.internal.util.OperatingSystemDetector;
import lombok.Data;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;

/**
 * @auther nhsoft.yex
 * @description 默认token管理 使用本地加密文件
 */
public class DefaultTokenStorage implements TokenStorage {
    /**
     * token文件后缀
     */
    private static final String TOKEN_FILE_SUFFIX = ".token_store";
    /**
     * 加密算法
     */
    private static final String ALGORITHM = "AES/GCM/NoPadding";
    /**
     * 密钥长度
     */
    private static final int GCM_TAG_LENGTH = 128;
    /**
     * IV长度
     */
    private static final int IV_LENGTH = 12;
    /**
     * 文件路径
     */
    private static final String TOKEN_FILE_DIR = "local";

    /**
     * 令牌信息存储结构
     */
    @Data
    private static class TokenData {
        private String accessToken;
        private String refreshToken;
        private long expireTime;
    }

    @Override
    public void store(TokenInfo tokenInfo) {
        try {
            String merchantId = tokenInfo.getMerchantId();
            TokenData tokenData = new TokenData();
            tokenData.setAccessToken(tokenInfo.getAccessToken());
            tokenData.setRefreshToken(tokenInfo.getRefreshToken());
            tokenData.setExpireTime(tokenInfo.getExpireTime());

            // 序列化令牌数据
            String jsonData = JsonUtil.toJson(tokenData);

            // 加密数据
            byte[] encryptedData = encrypt(jsonData);

            // 为每个商户号创建独立文件
            String fileName = getMerchantTokenFile(merchantId);
            
            // 确保目录存在
            createDirectoriesIfNeeded(fileName);

            // 写入文件
            Files.write(Paths.get(fileName), encryptedData);

        } catch (Exception e) {
            throw new RuntimeException("Failed to store token for merchant: " + tokenInfo.getMerchantId(), e);
        }
    }

    @Override
    public TokenInfo get(String merchantId) {
        try {
            String fileName = getMerchantTokenFile(merchantId);
            File file = new File(fileName);

            // 检查文件是否存在
            if (!file.exists()) {
                return null;
            }

            // 读取加密数据
            byte[] encryptedData = Files.readAllBytes(Paths.get(fileName));

            // 解密数据
            String jsonData = decrypt(encryptedData);

            // 反序列化
            TokenData tokenData = JsonUtil.fromJson(jsonData, TokenData.class);

            // 构造返回对象
            TokenInfo tokenInfo = new TokenInfo();
            tokenInfo.setMerchantId(merchantId);
            tokenInfo.setAccessToken(tokenData.getAccessToken());
            tokenInfo.setRefreshToken(tokenData.getRefreshToken());
            tokenInfo.setExpireTime(tokenData.getExpireTime());

            return tokenInfo;
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve token for merchant: " + merchantId, e);
        }
    }

    @Override
    public void remove(String merchantId) {
        try {
            Files.deleteIfExists(Paths.get(getMerchantTokenFile(merchantId)));
        } catch (IOException e) {
            throw new RuntimeException("Failed to remove token for merchant: " + merchantId, e);
        }
    }

    /**
     * 获取商户令牌文件路径
     */
    private String getMerchantTokenFile(String merchantId) {
        OperatingSystemDetector.OSType currentOS = OperatingSystemDetector.getCurrentOS();
        if (currentOS == OperatingSystemDetector.OSType.WINDOWS) {
            // 在Windows上使用用户主目录下的.local文件夹
            String userHome = System.getProperty("user.home");
            return userHome + "\\." + TOKEN_FILE_DIR + "\\" + merchantId + TOKEN_FILE_SUFFIX;
        }
        // Unix-like系统使用标准路径
        String userHome = System.getProperty("user.home");
        return userHome + "/." + TOKEN_FILE_DIR + "/" + merchantId + TOKEN_FILE_SUFFIX;
    }
    
    /**
     * 确保目录存在，如果不存在则创建
     * @param filePath 文件路径
     * @throws IOException 创建目录失败时抛出异常
     */
    private void createDirectoriesIfNeeded(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Path parentDir = path.getParent();
        if (parentDir != null && !Files.exists(parentDir)) {
            Files.createDirectories(parentDir);
        }
    }

    /**
     * 加密数据
     */
    private byte[] encrypt(String data) throws Exception {
        // 获取密钥
        SecretKey secretKey = getSecretKey();

        // 生成随机IV
        byte[] iv = new byte[IV_LENGTH];
        new SecureRandom().nextBytes(iv);

        // 初始化加密器
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, spec);

        // 加密数据
        byte[] encryptedData = cipher.doFinal(data.getBytes());

        // 将IV和加密数据合并
        byte[] result = new byte[iv.length + encryptedData.length];
        System.arraycopy(iv, 0, result, 0, iv.length);
        System.arraycopy(encryptedData, 0, result, iv.length, encryptedData.length);

        return result;
    }

    /**
     * 解密数据
     */
    private String decrypt(byte[] encryptedData) throws Exception {
        // 获取密钥
        SecretKey secretKey = getSecretKey();

        // 分离IV和加密数据
        byte[] iv = new byte[IV_LENGTH];
        byte[] data = new byte[encryptedData.length - IV_LENGTH];
        System.arraycopy(encryptedData, 0, iv, 0, IV_LENGTH);
        System.arraycopy(encryptedData, IV_LENGTH, data, 0, data.length);

        // 初始化解密器
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        GCMParameterSpec spec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, spec);

        // 解密数据
        byte[] decryptedData = cipher.doFinal(data);
        return new String(decryptedData);
    }

    /**
     * 获取加密密钥
     */
    private SecretKey getSecretKey() throws Exception {
        // 从环境变量获取密钥，如果不存在则生成默认密钥
        String keyString = System.getenv("TOKEN_ENCRYPTION_KEY");
        if (keyString == null || keyString.isEmpty()) {
            // 生产环境应该配置环境变量，这里仅为演示
            keyString = "123456";
        }

        // 使用SHA-256哈希确保密钥长度为256位
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] keyBytes = digest.digest(keyString.getBytes());

        return new SecretKeySpec(keyBytes, "AES");
    }
}