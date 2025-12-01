package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementPosItemV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementPosItemV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="211203613")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="00000001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="百事可乐5L")
    private String itemName;
    @ApiCloudField(value="商品条码", example="22000111")
    private String itemBarcode;
    @ApiCloudField(value="商品类别代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="商品类别名称", example="饮料")
    private String itemCategory;
    @ApiCloudField(value="商品规格", example="1*5L")
    private String itemSpec;
    @ApiCloudField(value="正价返点", example="0.03")
    private BigDecimal pvalRebate;
    @ApiCloudField(value="是否启用特价返点", example="true")
    private Boolean itemSpecialRebateUsing;
    @ApiCloudField(value="特价返点", example="0.02")
    private BigDecimal specialRebate;
    @ApiCloudField(value="约定价格", example="10.0")
    private BigDecimal itemPrice;
}
