package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeOnlineInfoDTO模型
 * 券类型线上信息DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeOnlineInfoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送方式(SELF_PICK:门店自提|DELIVERY:同城配送|EXPRESS:快递发货)", example="SELF_PICK", required=true)
    private List<String> pickTypes;
    @ApiCloudField(value="会员优惠互斥", example="true")
    private Boolean vipIncompatible;
    @ApiCloudField(value="允许叠加使用", example="true")
    private Boolean allowOverlay;
    @ApiCloudField(value="指定商品范围", example="true")
    private List<Long> variantIds;
    @ApiCloudField(value="例外商品范围", example="true")
    private List<Long> exceptVariantIds;
    @ApiCloudField(value="指定分组", example="true")
    private List<Integer> groupIds;
}
