package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShopOrderFindDTO模型
 * 商城订单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShopOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付开始时间", example="2021-01-26 00:00:00", required=true)
    private String payStartTime;
    @ApiCloudField(value="支付结束时间", example="2021-01-26 00:00:00", required=true)
    private String payEndTime;
    @ApiCloudField(value="单据类型(shop:微商城单据kanjia:砍价单据points_exchange:积分兑换单据pre_sale:预售订单card_exchange:兑换卡订单)", example="shop")
    private String orderType;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
