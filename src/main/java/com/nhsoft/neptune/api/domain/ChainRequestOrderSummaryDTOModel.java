package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ChainRequestOrderSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChainRequestOrderSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="调出门店编码", example="99")
    private Integer outBranchNum;
    @ApiCloudField(value="商品档案编号", example="99")
    private Integer itemNum;
    @ApiCloudField(value="审核日期", example="99")
    private String date;
    @ApiCloudField(value="调出常用数量", example="10.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="调出基本数量", example="10.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="要货金额", example="10.0")
    private BigDecimal itemSubTotal;
    @ApiCloudField(value="要货成本", example="10.0")
    private BigDecimal itemCost;
}
