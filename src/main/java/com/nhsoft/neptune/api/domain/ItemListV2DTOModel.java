package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemListV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemListV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102207121")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品类型编号(1:标准4:组合商品5:非库存商品6:制单组合7:制单拆分8:自定义组合9:成分商品10:分级商品11:原料商品)")
    private Integer itemType;
    @ApiCloudField(value="商品规格", example="")
    private String itemSpec;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="经营方式", example="")
    private String itemMethod;
    @ApiCloudField(value="商品拼音", example="")
    private String storeItemPinyin;
    @ApiCloudField(value="商品基本单位", example="")
    private String itemUnit;
    @ApiCloudField(value="商品类别", example="")
    private String itemCategory;
    @ApiCloudField(value="最低售价")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="最高售价")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="商品类别编号", example="")
    private String itemCategoryCode;
    @ApiCloudField(value="商品部门", example="")
    private String itemDepartment;
    @ApiCloudField(value="销售提醒", example="")
    private String itemSaleMessage;
    @ApiCloudField(value="允许改价标记", example="false")
    private Boolean itemPosChangePriceFlag;
    @ApiCloudField(value="是否停售标记", example="false")
    private Boolean itemSaleCeaseFlag;
    @ApiCloudField(value="删除标记", example="false")
    private Boolean itemDelTag;
    @ApiCloudField(value="是否启用积分", example="false")
    private Boolean itemPointActived;
    @ApiCloudField(value="积分值")
    private BigDecimal itemPointValue;
    @ApiCloudField(value="品牌", example="")
    private String itemBrand;
    @ApiCloudField(value="英文名称", example="")
    private String itemEnName;
    @ApiCloudField(value="成本模式", example="")
    private String itemCostMode;
    @ApiCloudField(value="有效天数")
    private Integer itemValidPeriod;
    @ApiCloudField(value="成本价")
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="配送价")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="辅助数量", example="")
    private String itemAssistUnit;
    @ApiCloudField(value="序号")
    private Integer itemSequence;
    @ApiCloudField(value="淘汰标记", example="false")
    private Boolean itemEliminativeFlag;
    @ApiCloudField(value="商品创建时间", example="")
    private String itemCreateTime;
    @ApiCloudField(value="辅助单位换算率")
    private BigDecimal itemAssistRate;
    @ApiCloudField(value="商品休眠状态")
    private Integer itemStatus;
    @ApiCloudField(value="是否允许折扣", example="false")
    private Boolean itemDiscounted;
    @ApiCloudField(value="进项税")
    private BigDecimal itemInTax;
    @ApiCloudField(value="出项税")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="商品称重标记", example="false")
    private Boolean itemWeightFlag;
    @ApiCloudField(value="商品标准售价")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="商品售价2")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="商品售价3")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="商品售价4")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="商品批发标准售价")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="商品批发售价2")
    private BigDecimal itemLevel2Wholesale;
    @ApiCloudField(value="商品批发售价3")
    private BigDecimal itemLevel3Wholesale;
    @ApiCloudField(value="商品批发售价4")
    private BigDecimal itemLevel4Wholesale;
    @ApiCloudField(value="商品最后修改时间", example="")
    private String itemLastEditTime;
    @ApiCloudField(value="顶级分类ID", example="")
    private String itemTopCategoryCode;
    @ApiCloudField(value="顶级分类名称", example="")
    private String itemTopCategoryName;
    @ApiCloudField(value="商品长度")
    private BigDecimal itemAreaLength;
    @ApiCloudField(value="商品宽度")
    private BigDecimal itemAreaWidth;
    @ApiCloudField(value="商品高度")
    private BigDecimal itemAreaHigh;
    @ApiCloudField(value="库存成本价")
    private BigDecimal itemInventoryCostPrice;
    @ApiCloudField(value="商品条码列表", example="")
    private List<PosItemBarV2DTOModel> itemBars;
    @ApiCloudField(value="pos_item_matrix")
    private PosItemMatrixV2DTOModel posItemMatrix;
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
}
