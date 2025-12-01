package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponCreateV2DTO模型
 * 消费券创建
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponCreateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="发券数量  必须正数   每次发券数量必须小于1000", example="1", required=true)
    private Integer couponCount;
    @ApiCloudField(value="消费券类型名称", example="满减券")
    private String ticketName;
    @ApiCloudField(value="消费券类型代码（ticket_name 和 ticket_code不能同时为空）", example="111")
    private String ticketCode;
    @ApiCloudField(value="发券人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="手机号(crm)", example="185XXXXXXXX")
    private String phone;
    @ApiCloudField(value="消费券密码", example="123456")
    private String ticketPassword;
    @ApiCloudField(value="第三方单据编号  用于撤销消费券发放(也可用作发券幂等)", example="52001201931190008")
    private String outTradeNo;
    @ApiCloudField(value="券有效天数  不传的话默认为30天", example="30")
    private Integer couponValidDay;
    @ApiCloudField(value="券有效开始时间")
    private String couponValidStartTime;
}
