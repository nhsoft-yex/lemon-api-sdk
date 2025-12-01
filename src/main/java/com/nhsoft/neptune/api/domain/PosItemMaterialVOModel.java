package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemMaterialVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemMaterialVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="门店", example="")
    private String branchName;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarCode;
    @ApiCloudField(value="规格", example="")
    private String itemSpec;
    @ApiCloudField(value="基本单位", example="")
    private String itemUnit;
    @ApiCloudField(value="单位用量")
    private BigDecimal posItemMaterialAmount;
    @ApiCloudField(value="物料类型(原料|辅料)", example="原料")
    private String posItemMaterialType;
    @ApiCloudField(value="生产班组", example="")
    private String productClass;
    @ApiCloudField(value="核算方式", example="")
    private String itemCostMode;
    @ApiCloudField(value="单价")
    private BigDecimal price;
    @ApiCloudField(value="采购单位", example="")
    private String itemPurchaseUnit;
    @ApiCloudField(value="采购换算率")
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="库存单位", example="")
    private String itemInventoryUnit;
    @ApiCloudField(value="库存换算率")
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="配送单位", example="")
    private String itemTransferUnit;
    @ApiCloudField(value="配送换算率")
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="批发单位", example="")
    private String itemWholesaleUnit;
    @ApiCloudField(value="批发换算率")
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="库存数量")
    private BigDecimal inventoryQty;
    @ApiCloudField(value="库存常用数量")
    private BigDecimal inventoryUseQty;
    @ApiCloudField(value="是否辅助商品", example="false")
    private Boolean itemFixedIs;
    @ApiCloudField(value="辅助单位", example="")
    private String itemAssistUnit;
    @ApiCloudField(value="辅助换算率")
    private BigDecimal itemAssistRate;
    @ApiCloudField(value="最近进价")
    private BigDecimal purchasePrice;
    @ApiCloudField(value="新物料商品编码")
    private Integer newItemMaterialNum;
}
