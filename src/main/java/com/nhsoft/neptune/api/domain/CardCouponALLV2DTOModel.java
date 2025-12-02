package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponALLV2DTO模型
 * 会员卡优惠券全部信息V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponALLV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="卡编码", example="150200002", required=true)
    private String cardUserNum;
    @ApiCloudField(value="0有效 1已使用  2 已过期", example="1")
    private Integer state;
    @ApiCloudField(value="查询起始日期（全渠道会员）", example="2021-01-01")
    private String dateFrom;
    @ApiCloudField(value="查询结束日期（全渠道会员）", example="2021-01-01")
    private String dateTo;
}
