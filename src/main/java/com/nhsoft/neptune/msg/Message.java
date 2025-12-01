package com.nhsoft.neptune.msg;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nhsoft.neptune.api.internal.util.StringUtils;
import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @auther nhsoft.yex
 */
@Data
public class Message {
    /**
     * 链路id
     */
    @JsonProperty("trace_id")
    private String traceId;
    /**
     * 商户类型
     */
    @JsonProperty("merchant_type")
    private String merchantType;

    /**
     * 商户id
     */
    @JsonProperty("merchant_id")
    private String merchantId;

    /**
     * 可以理解为topic
     */
    @JsonProperty("notice_type")
    private String noticeType;

    /**
     * 开放平台appid
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * 签名
     */
    @JsonProperty("sign")
    private String sign;

    /**
     * json 格式
     */
    @JsonProperty("body")
    private String body;


    public boolean checkSign(String secret) {
        Map<String, String> map = new HashMap<>();
        map.put("trace_id", traceId);
        map.put("merchant_type", merchantType);
        map.put("merchant_id", merchantId);
        map.put("notice_type", noticeType);
        map.put("app_id", appId);
        map.put("body", body);
        String str = map.entrySet().stream()
                .filter(e -> !StringUtils.isEmpty((String) e.getValue()))
                .map(e -> e.getKey() + "=" + e.getValue()).sorted(String::compareTo)
                .collect(Collectors.joining("&"));
        str += "&key=" + secret;
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new MsgException("");
        }
        byte[] digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));
        // 转换为十六进制字符串
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        String computedSign = sb.toString();
        return sign.equalsIgnoreCase(computedSign);
    }
}
