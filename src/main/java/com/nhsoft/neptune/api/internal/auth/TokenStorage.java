package com.nhsoft.neptune.api.internal.auth;

/**
 * @auther nhsoft.yex
 */
public interface TokenStorage {

    /**
     * 存储token
     *
     * @param tokenInfo 令牌信息
     */
    void store(TokenInfo tokenInfo);

    /**
     * 删除token
     *
     * @param merchantId 商户号
     */
    void remove(String merchantId);

    /**
     * 获取访问token
     *
     * @param merchantId 商户号
     * @return 访问token
     */
    TokenInfo get(String merchantId);
}
