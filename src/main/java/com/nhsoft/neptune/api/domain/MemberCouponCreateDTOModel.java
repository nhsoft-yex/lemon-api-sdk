package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="优惠券", required=true)
    private List<MemberCouponCreateDetailDTOModel> coupons;
}
