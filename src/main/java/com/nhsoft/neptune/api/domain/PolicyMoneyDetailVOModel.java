package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyMoneyDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyMoneyDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434419404")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="435256462")
    private Integer itemGradeNum;
    @ApiCloudField(value="促销价格", example="5.0")
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="可购数量", example="5")
    private BigDecimal itemSaleAmount;
    @ApiCloudField(value="明细备注", example="备注信息")
    private String itemMemo;
}
