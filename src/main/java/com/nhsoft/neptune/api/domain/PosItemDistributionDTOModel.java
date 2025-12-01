package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDistributionDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDistributionDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="推荐商品", example="false")
    private Boolean dcmRecommended;
    @ApiCloudField(value="超过中心库存不允许要货", example="false")
    private Boolean noStockNoRequest;
    @ApiCloudField(value="每日订购下限")
    private BigDecimal dcmRequestLowerLimit;
    @ApiCloudField(value="每日订购上限")
    private BigDecimal dcmRequestUpperLimit;
    @ApiCloudField(value="订购基数")
    private BigDecimal dcmRequestMultiple;
    @ApiCloudField(value="配送中心调出忽略库存", example="false")
    private Boolean centerOutIgnoreInventory;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarcode;
    @ApiCloudField(value="商品规格", example="")
    private String itemSpec;
    @ApiCloudField(value="商品类别名称", example="")
    private String itemCategory;
    @ApiCloudField(value="商品配送单位", example="")
    private String itemTransferUnit;
    @ApiCloudField(value="商品配送价率")
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="配送数量使用下限")
    private BigDecimal dcmRequestLowerUseLimit;
    @ApiCloudField(value="配送数量使用上限")
    private BigDecimal dcmRequestUpperUseLimit;
}
