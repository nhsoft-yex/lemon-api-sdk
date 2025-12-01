package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderSaleSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderSaleSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品代码", example="123456")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="8122100001")
    private String itemBarcode;
    @ApiCloudField(value="商品分类代码", example="1")
    private String itemCategoryCode;
    @ApiCloudField(value="销售数量", example="10.0")
    private BigDecimal sumAmount;
    @ApiCloudField(value="销售金额", example="10.0")
    private BigDecimal totalSaleMoney;
    @ApiCloudField(value="销售成本", example="10.0")
    private BigDecimal sumCost;
    @ApiCloudField(value="销售毛利", example="10.0")
    private BigDecimal sumProfit;
}
