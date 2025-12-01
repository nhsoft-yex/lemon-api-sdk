package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434420439")
    private Integer itemNum;
    @ApiCloudField(value="分级商品系统编码", example="434400015")
    private Integer itemGradeNum;
    @ApiCloudField(value="促销价格", example="5.0")
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="标准售价", example="0.0")
    private BigDecimal itemStdPrice;
    @ApiCloudField(value="可购数量", example="1")
    private BigDecimal itemSaleAmount;
    @ApiCloudField(value="购买数量", example="1")
    private BigDecimal itemBuyAmount;
    @ApiCloudField(value="可购上限", example="8")
    private BigDecimal itemSaleLimit;
    @ApiCloudField(value="总数量上限", example="5")
    private BigDecimal itemQuantityLimit;
    @ApiCloudField(value="明细备注", example="备注明细")
    private String itemMemo;
}
