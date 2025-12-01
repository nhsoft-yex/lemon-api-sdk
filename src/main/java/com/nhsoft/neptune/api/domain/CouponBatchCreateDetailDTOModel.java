package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponBatchCreateDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponBatchCreateDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="发券数量  必须正数   每次发券数量必须小于10", example="1", required=true)
    private Integer couponCount;
    @ApiCloudField(value="手机号(crm)", example="185XXXXXXXX")
    private String phone;
    @ApiCloudField(value="消费券密码", example="123456")
    private String ticketPassword;
    @ApiCloudField(value="券有效天数  不传的话默认为30天", example="30")
    private Integer couponValidDay;
    @ApiCloudField(value="券有效开始时间")
    private String couponValidStartTime;
}
