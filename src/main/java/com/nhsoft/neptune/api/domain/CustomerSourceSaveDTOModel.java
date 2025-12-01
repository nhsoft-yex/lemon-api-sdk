package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerSourceSaveDTO模型
 * 客户来源保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSourceSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="头像路径", example="https://oss.nhsoft.cn/logo.jpg")
    private String avatar;
    @ApiCloudField(value="昵称", example="测试人")
    private String nickname;
    @ApiCloudField(value="全渠道会员Id", example="2095001", required=true)
    private String customerId;
    @ApiCloudField(value="三方渠道会员标识", example="2088000211", required=true)
    private String openid;
    @ApiCloudField(value="来源渠道 WECHAT_OFFICIAL(公众号)|WECHAT_MP(小程序)|WECHAT_PAY(微信支付)|ALIPAY_PAY(支付宝支付)|MANUAL(导入/新增)|OFFLINE(线下开卡)|WECOM(企业微信)|OMS(第三方平台)", example="WECHAT_OFFICIAL", required=true)
    private String source;
    @ApiCloudField(value="三方平台应用id(如微信小程序appid)", example="akmkmm5222211a", required=true)
    private String appid;
}
