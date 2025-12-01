package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSumV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSumV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434420031")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="时间", example="20210507")
    private String bizday;
    @ApiCloudField(value="销售数量", example="1.0")
    private BigDecimal saleAmount;
    @ApiCloudField(value="销售金额", example="10.0")
    private BigDecimal saleMoney;
    @ApiCloudField(value="退款数量", example="0")
    private BigDecimal returnAmount;
    @ApiCloudField(value="退款金额", example="0")
    private BigDecimal returnMoney;
}
