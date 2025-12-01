package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberReadDTO模型
 * 会员读取参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="手机号码(或会员id或付款码 三选一)", example="18058530800")
    private String phone;
    @ApiCloudField(value="会员ID(或手机号码或付款码 三选一)", example="207200025932")
    private String customerId;
    @ApiCloudField(value="会员码(或手机号码或会员ID 三选一)", example="207200025932")
    private String paycode;
    @ApiCloudField(value="是否查询会员有效券的数量", example="true")
    private Boolean queryCoupon;
    @ApiCloudField(value="是否查询会员渠道信息", example="true")
    private Boolean queryMercuryCustomer;
}
