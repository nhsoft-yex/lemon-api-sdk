package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDistributionDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDistributionDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="209500001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="推荐商品(不填写默认为false)", example="false")
    private Boolean dcmRecommended;
    @ApiCloudField(value="超过中心库存不允许要货(不填写默认为false)", example="false")
    private Boolean noStockNoRequest;
    @ApiCloudField(value="每日订购下限", example="1.0")
    private BigDecimal dcmRequestLowerLimit;
    @ApiCloudField(value="每日订购上限", example="1.0")
    private BigDecimal dcmRequestUpperLimit;
    @ApiCloudField(value="订购基数", example="1.0")
    private BigDecimal dcmRequestMultiple;
    @ApiCloudField(value="不允许退货", example="false")
    private Boolean dcmCannotReturn;
    @ApiCloudField(value="配送中心调出忽略库存(不填写默认为false)", example="false")
    private Boolean centerOutIgnoreInventory;
    @ApiCloudField(value="每日订购使用下限", example="1.0")
    private BigDecimal dcmRequestLowerUseLimit;
    @ApiCloudField(value="每日订购使用上限", example="1.0")
    private BigDecimal dcmRequestUpperUseLimit;
}
