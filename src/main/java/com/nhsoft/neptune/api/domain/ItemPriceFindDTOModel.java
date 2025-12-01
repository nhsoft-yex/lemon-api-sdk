package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemPriceFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemPriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value=" 调出门店编号", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value=" 调入门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value=" 仓库编号", example="9967500001")
    private Integer storehouseNum;
    @ApiCloudField(value=" 单据类型(要货单|调出单|调入单)", example="要货单")
    private String orderType;
    @ApiCloudField(value=" 商品明细", example="", required=true)
    private List<ItemPriceDetailFindDTOModel> itemPriceDetails;
}
