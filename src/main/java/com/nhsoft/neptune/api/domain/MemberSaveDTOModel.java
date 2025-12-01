package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberSaveDTO模型
 * 会员保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="手机号", example="17644219971", required=true)
    private String phone;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="会员名称", example="叶新", required=true)
    private String name;
    @ApiCloudField(value="出生日期", example="1978-12-06")
    private String birthday;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
    @ApiCloudField(value="性别(1-未知,2-男,3-女)", example="1")
    private Integer gender;
    @ApiCloudField(value="用户来源(公众号|小程序|微信支付|支付宝支付|导入|线下开卡|企业微信|第三方平台|支付宝小程序|抖音会员)", example="支付宝支付")
    private String source;
    @ApiCloudField(value="外部用户id", example="1")
    private String outUserId;
}
