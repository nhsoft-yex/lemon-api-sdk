package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCardOutV2DTO模型
 * 会员卡外部信息V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCardOutV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="手机号", example="185XXXXXXXX")
    private String userPhone;
    @ApiCloudField(value="用户名", example="用户名")
    private String userName;
    @ApiCloudField(value="生日(yyyy-mm-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String birthday;
    @ApiCloudField(value="发卡门店（默认99）", example="99")
    private Integer enrollShop;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="微信openId", example="oQ8Ihv6968CNwAWs5NXPuIZyxtII")
    private String openId;
    @ApiCloudField(value="发卡时间", example="2021-01-21 00:00:00")
    private String cardUserDate;
    @ApiCloudField(value="表面卡号", example="20215613151651")
    private String cardPrintedNum;
    @ApiCloudField(value="物理卡号", example="000192")
    private String cardPhysicalNum;
    @ApiCloudField(value="卡类型", example="电子卡99")
    private String cardUserTypeName;
}
