package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponPlatformInfoVO模型
 * 会员优惠券平台信息VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponPlatformInfoVOModel extends ApiCloudObject {

    @ApiCloudField(value="券ID", example="18010055021131225", required=true)
    private String id;
    @ApiCloudField(value="平台类型（DY:抖音,KB:口碑,MT:美团,ZFB:支付宝,KS:快手）", example="ZFB", required=true)
    private String platform;
    @ApiCloudField(value="卷售价取值（LEMENG_SALE_PRICE:乐檬券类型售价，PLATFORM_PAID_UP:三方平台实收金额）", example="LEMENG_SALE_PRICE", required=true)
    private String salePriceType;
    @ApiCloudField(value="卷面值取值（LEMENG:乐檬券类型面值，PLATFORM:三方券面值）", example="PLATFORM", required=true)
    private String valueType;
}
