package com.nhsoft.neptune.api.internal.auth;

import com.nhsoft.neptune.ApiCloudObject;
import lombok.Data;

/**
 * @auther nhsoft.yex
 */
@Data
public class ApiCloudOpenAuthTokenAppModel extends ApiCloudObject {
    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 应用授权码，传入应用授权后得到的  app_auth_code。
     * 说明：
     * grant_type 为 authorization_code 时，本参数必填；
     * grant_type 为 refresh_token 时不填。
     */
    private String code;

    /**
     * 授权方式。支持：
     * authorization_code：使用应用授权码换取应用授权令牌app_auth_token。
     * refresh_token：使用app_refresh_token刷新获取新授权令牌。
     */
    private String grantType;

    /**
     * 回调地址，授权成功后，系统将重定向到该地址。
     * 说明：
     * grant_type 为 authorization_code 时，本参数必填；
     * grant_type 为 refresh_token 时不填。
     */
    private String redirectUri;

    /**
     * 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type=authorization_code 调用此接口一次才能获取）。
     */
    private String refreshToken;
}
