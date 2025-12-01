package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponBindDTO模型
 * 会员优惠券绑定
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员手机号(会员ID和手机号同时存在，会员ID优先级更高)", example="17644219987")
    private String phone;
    @ApiCloudField(value="会员ID(会员ID和手机号同时存在，会员ID优先级更高)", example="207200025932")
    private String customerId;
    @ApiCloudField(value="消费券券码", example="98991810440004", required=true)
    private String barcode;
    @ApiCloudField(value="消费券密码", example="123466", required=true)
    private String password;
}
