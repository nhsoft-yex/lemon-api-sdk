package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ChainOutOrderSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChainOutOrderSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入门店编码", example="1")
    private Integer inBranchNum;
    @ApiCloudField(value="调出门店编码", example="99")
    private Integer outBranchNum;
    @ApiCloudField(value="商品档案编号", example="99")
    private Integer itemNum;
    @ApiCloudField(value="审核日期", example="99")
    private String date;
    @ApiCloudField(value="调出常用数量", example="10.0")
    private BigDecimal detailUseQty;
    @ApiCloudField(value="调出基本数量", example="10.0")
    private BigDecimal detailQty;
    @ApiCloudField(value="赠品常用数量", example="10.0")
    private BigDecimal presentUseQty;
    @ApiCloudField(value="赠品基本数量", example="10.0")
    private BigDecimal presentQty;
    @ApiCloudField(value="调出金额", example="10.0")
    private BigDecimal detailSubTotal;
    @ApiCloudField(value="调出成本", example="10.0")
    private BigDecimal detailCost;
}
