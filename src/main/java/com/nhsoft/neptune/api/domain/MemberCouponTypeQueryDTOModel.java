package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeQueryDTO模型
 * 会员优惠券类型查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeQueryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="券类型名称", example="测试券", required=true)
    private String name;
    @ApiCloudField(value="券类型分类(MONEY:面值券|ITEM:商品券|DEPOSIT:储值券|DISCOUNT:折扣券|FEE:运费券)", example="MONEY")
    private List<String> categories;
    @ApiCloudField(value="查券类型分组:true=查,false或null则不查", example="false")
    private Boolean queryTypeGroup;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean enable;
    @ApiCloudField(value="更新开始时间")
    private String dateFrom;
    @ApiCloudField(value="更新结束时间")
    private String dateTo;
}
