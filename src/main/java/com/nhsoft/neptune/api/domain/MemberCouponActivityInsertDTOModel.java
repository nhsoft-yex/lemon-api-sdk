package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponActivityInsertDTO模型
 * 会员优惠券活动插入
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponActivityInsertDTOModel extends ApiCloudObject {

    @ApiCloudField(value="是否使用商家券", example="true")
    private Boolean allpayCoupon;
    @ApiCloudField(value="渠道", example="AMA", required=true)
    private String channel;
    @ApiCloudField(value="详情列表", required=true)
    private List<MemberCouponActivityInsertDetailDTOModel> details;
    @ApiCloudField(value="名称", required=true)
    private String name;
    @ApiCloudField(value="外部活动ID", required=true)
    private String outActivityId;
    @ApiCloudField(value="活动类型", required=true)
    private String type;
}
