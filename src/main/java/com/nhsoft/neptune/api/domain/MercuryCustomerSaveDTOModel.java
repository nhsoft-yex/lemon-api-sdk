package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryCustomerSaveDTO模型
 * 水星会员保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryCustomerSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="头像", example="https://XXXXX")
    private String avatar;
    @ApiCloudField(value="昵称", example="张三")
    private String nickname;
    @ApiCloudField(value="全渠道会员ID", example="207200001")
    private String customerId;
    @ApiCloudField(value="第三方会员标识", example="2088000211")
    private String openid;
    @ApiCloudField(value="微信unionid", example="2088000211")
    private String unionid;
    @ApiCloudField(value="手机号码", example="157825877010", required=true)
    private String phone;
    @ApiCloudField(value="平台（1:h5, 2:小程序, WECOM:企业微信,ALIPAY_PAY:支付宝）", example="ALIPAY_PAY", required=true)
    private String platform;
    @ApiCloudField(value="性别(0-未知,1-男,2-女)", example="0")
    private Integer gender;
    @ApiCloudField(value="用户来源(公众号|小程序|微信支付|支付宝支付|导入|线下开卡|企业微信|第三方平台)", example="支付宝支付")
    private String source;
    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
}
