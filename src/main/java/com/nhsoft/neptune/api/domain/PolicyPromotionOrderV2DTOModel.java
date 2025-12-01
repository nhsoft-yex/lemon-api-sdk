package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品代码", example="0001")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="24129884")
    private String itemBarCode;
    @ApiCloudField(value="商品单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品规格", example="1箱/10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品标签", example="新鲜,水果")
    private String itemLable;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="门店代码", example="1")
    private String branchCode;
    @ApiCloudField(value="门店名称", example="门店1")
    private String branchName;
    @ApiCloudField(value="促销单号", example="4344990003963")
    private String allowOrderFid;
    @ApiCloudField(value="促销类型", example="促销特价")
    private String allowOrderType;
    @ApiCloudField(value="返利类型", example="")
    private String policyPromotionType;
    @ApiCloudField(value="促销开始时间")
    private String policyPromotionFrom;
    @ApiCloudField(value="促销结束时间")
    private String policyPromotionTo;
    @ApiCloudField(value="单据状态", example="制单|审核")
    private String policyPromotionState;
    @ApiCloudField(value="促销价", example="10.0")
    private BigDecimal policyPrice;
    @ApiCloudField(value="促销进价", example="5.0")
    private BigDecimal policyCost;
    @ApiCloudField(value="促销量", example="20")
    private BigDecimal policySaleAmount;
    @ApiCloudField(value="基础库存", example="100")
    private BigDecimal storeMatrixBaseStock;
    @ApiCloudField(value="补货订购点", example="10")
    private BigDecimal storeMatrixReorderPoint;
    @ApiCloudField(value="补货订购量", example="100")
    private BigDecimal storeMatrixReorderQty;
    @ApiCloudField(value="库存上限", example="1000")
    private BigDecimal storeMatrixUpperStock;
    @ApiCloudField(value="补货基数")
    private Integer storeMatrixOrderBase;
    @ApiCloudField(value="扩展属性1", example="")
    private String itemExtend1;
    @ApiCloudField(value="扩展属性2", example="")
    private String itemExtend2;
    @ApiCloudField(value="扩展属性3", example="")
    private String itemExtend3;
    @ApiCloudField(value="扩展属性4", example="")
    private String itemExtend4;
    @ApiCloudField(value="扩展属性5", example="")
    private String itemExtend5;
    @ApiCloudField(value="扩展属性6", example="")
    private String itemExtend6;
    @ApiCloudField(value="促销销量", example="20.0")
    private BigDecimal policySaleAmountSum;
}
