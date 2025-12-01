package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemWithMaterialVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemWithMaterialVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarcode;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品规格", example="")
    private String itemSpec;
    @ApiCloudField(value="拼音", example="")
    private String storeItemPinyin;
    @ApiCloudField(value="1-标准，2-含多特性，3-标识码，4-组合商品，5-非库存商品，6-制单组合，7-制单拆分，8-自定义组合，9-成分商品，10-分级商品，11-原料商品")
    private Integer itemType;
    @ApiCloudField(value="商品单位", example="")
    private String itemUnit;
    @ApiCloudField(value="商品部门", example="")
    private String itemDepartment;
    @ApiCloudField(value="商品类别名称", example="")
    private String itemCategory;
    @ApiCloudField(value="标准价格")
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="2级价格")
    private BigDecimal itemLevel2Price;
    @ApiCloudField(value="3级价格")
    private BigDecimal itemLevel3Price;
    @ApiCloudField(value="4级价格")
    private BigDecimal itemLevel4Price;
    @ApiCloudField(value="注意事项", example="")
    private String itemNoteInfo;
    @ApiCloudField(value="销售提醒", example="")
    private String itemSaleMessage;
    @ApiCloudField(value="发票提醒", example="")
    private String itemInvoiceMessage;
    @ApiCloudField(value="前台议价", example="false")
    private Boolean itemPosChangePriceFlag;
    @ApiCloudField(value="最低价格")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean itemDelTag;
    @ApiCloudField(value="是否启用积分", example="false")
    private Boolean itemPointActived;
    @ApiCloudField(value="积分价格")
    private BigDecimal itemPointValue;
    @ApiCloudField(value="品牌", example="")
    private String itemBrand;
    @ApiCloudField(value="计算规则、成本核算方式", example="")
    private String itemCostMode;
    @ApiCloudField(value="有效天数")
    private Integer itemValidPeriod;
    @ApiCloudField(value="过期催销天数")
    private Integer itemRemindPeriod;
    @ApiCloudField(value="停购标记", example="false")
    private Boolean itemStockCeaseFlag;
    @ApiCloudField(value="停售标记", example="false")
    private Boolean itemSaleCeaseFlag;
    @ApiCloudField(value="采购范围", example="")
    private String itemPurchaseScope;
    @ApiCloudField(value="成本价")
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="配送价")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="类别代码", example="")
    private String itemCategoryCode;
    @ApiCloudField(value="产地", example="")
    private String itemPlace;
    @ApiCloudField(value="排序字段")
    private Integer itemSequence;
    @ApiCloudField(value="创建时间")
    private String itemCreateTime;
    @ApiCloudField(value="淘汰标记", example="false")
    private Boolean itemEliminativeFlag;
    @ApiCloudField(value="是否称重商品", example="false")
    private Boolean itemWeightFlag;
    @ApiCloudField(value="标准库存、批次库存、非库存", example="")
    private String whsInventoryType;
    @ApiCloudField(value="商贸成本核算方式:移动加权平均、加权平均、先进先出、批次核算成本", example="")
    private String whsItemCostMode;
    @ApiCloudField(value="不固定重量", example="false")
    private Boolean itemNonFixedWeight;
    @ApiCloudField(value="仓储位置", example="")
    private String itemStorePlace;
    @ApiCloudField(value="辅助单位", example="")
    private String itemAssistUnit;
    @ApiCloudField(value="辅助换算率")
    private BigDecimal itemAssistRate;
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
    @ApiCloudField(value="配送换算率(最初档案换算率)")
    private BigDecimal itemTransferRateOld;
    @ApiCloudField(value="批发单位", example="")
    private String itemWholesaleUnit;
    @ApiCloudField(value="批发换算率")
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="计量单位组", example="")
    private String itemUnitGroup;
    @ApiCloudField(value="批发价格")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="价签打印", example="false")
    private Boolean itemPriceTagFlag;
    @ApiCloudField(value="删除时间")
    private String itemDelTime;
    @ApiCloudField(value="最后修改时间")
    private String itemLastEditTime;
    @ApiCloudField(value="销售类别-购销/联营/代销", example="")
    private String itemMethod;
    @ApiCloudField(value="联营扣率")
    private BigDecimal itemGrossRate;
    @ApiCloudField(value="休眠标记")
    private Integer itemStatus;
    @ApiCloudField(value="禁用批发 EAR-192537", example="false")
    private Boolean wholesaleForbidden;
    @ApiCloudField(value="批发2级价格")
    private BigDecimal itemLevel2Wholesale;
    @ApiCloudField(value="批发3级价格")
    private BigDecimal itemLevel3Wholesale;
    @ApiCloudField(value="批发4级价格")
    private BigDecimal itemLevel4Wholesale;
    @ApiCloudField(value="允许在线批发", example="false")
    private Boolean itemWholesaleFlag;
    @ApiCloudField(value="英文名称", example="")
    private String itemEnName;
    @ApiCloudField(value="锁定配送毛利比例")
    private BigDecimal itemTransferGross;
    @ApiCloudField(value="是否锁定配送毛利", example="false")
    private Boolean itemTransferFixedGross;
    @ApiCloudField(value="锁定批发毛利比例")
    private BigDecimal itemWholesaleGross;
    @ApiCloudField(value="是否锁定批发毛利", example="false")
    private Boolean itemWholesaleFixedGross;
    @ApiCloudField(value="允许前台折扣", example="false")
    private Boolean itemDiscounted;
    @ApiCloudField(value="前台打印标签", example="false")
    private Boolean itemPrintLabelFlag;
    @ApiCloudField(value="最小数量")
    private BigDecimal itemMinQuantity;
    @ApiCloudField(value="锁定批发毛利比例2")
    private BigDecimal itemWholesaleGross2;
    @ApiCloudField(value="锁定批发毛利比例3")
    private BigDecimal itemWholesaleGross3;
    @ApiCloudField(value="锁定批发毛利比例4")
    private BigDecimal itemWholesaleGross4;
    @ApiCloudField(value="是否锁定批发毛利2", example="false")
    private Boolean itemWholesaleFixedGross2;
    @ApiCloudField(value="是否锁定批发毛利3", example="false")
    private Boolean itemWholesaleFixedGross3;
    @ApiCloudField(value="是否锁定批发毛利4", example="false")
    private Boolean itemWholesaleFixedGross4;
    @ApiCloudField(value="最大价格")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="动销天数")
    private Integer itemTransferDay;
    @ApiCloudField(value="销项税率")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="免税标记", example="false")
    private Boolean freeTaxFlag;
    @ApiCloudField(value="进项税率")
    private BigDecimal itemInTax;
    @ApiCloudField(value="加工商品", example="false")
    private Boolean itemManufactureFlag;
    @ApiCloudField(value="完成率")
    private BigDecimal itemFinishedRate;
    @ApiCloudField(value="是否有扩展属性", example="false")
    private Boolean itemHasMatrix;
    @ApiCloudField(value="创建人", example="")
    private String itemCreator;
    @ApiCloudField(value="门店")
    private Integer branchNum;
    @ApiCloudField(value="配送锁定毛利方式  1-按比例  2-按金额")
    private Integer itemTransferFixType;
    @ApiCloudField(value="批发锁定毛利方式  1-按比例  2-按金额")
    private Integer itemWholesaleFixType;
    @ApiCloudField(value="item_wholesale_fix_type2")
    private Integer itemWholesaleFixType2;
    @ApiCloudField(value="item_wholesale_fix_type3")
    private Integer itemWholesaleFixType3;
    @ApiCloudField(value="item_wholesale_fix_type4")
    private Integer itemWholesaleFixType4;
    @ApiCloudField(value="锁定辅助单位配送价", example="false")
    private Boolean itemFixAssistTransferPrice;
    @ApiCloudField(value="锁定辅助单位批发价", example="false")
    private Boolean itemFixAssistWholesalePrice;
    @ApiCloudField(value="负库存允许销售", example="false")
    private Boolean itemSaleNoStore;
    @ApiCloudField(value="是否允许门店调价")
    private Integer itemPriceAdj;
    @ApiCloudField(value="税收编码", example="")
    private String itemTaxCode;
    @ApiCloudField(value="是否启用包装盒", example="false")
    private Boolean itemPackageActived;
    @ApiCloudField(value="应用范围", example="")
    private String itemScope;
    @ApiCloudField(value="回货单价")
    private BigDecimal recycledPrice;
    @ApiCloudField(value="启用条码换算率", example="false")
    private Boolean itemEnableBarRate;
    @ApiCloudField(value="生命周期（1:试销,2:评估,3:正常,4:淘汰,5:删除）")
    private Integer itemLiftCycle;
    @ApiCloudField(value="试销截止日")
    private String testMarketEndDate;
    @ApiCloudField(value="锁定辅助单位进货价", example="false")
    private Boolean itemFixAssistCostPrice;
    @ApiCloudField(value="淘汰时间")
    private String itemEliminativeDate;
    @ApiCloudField(value="淘汰操作人", example="")
    private String itemEliminativeOperator;
    @ApiCloudField(value="无库存不允许要货", example="false")
    private Boolean noStockNoRequest;
    @ApiCloudField(value="条码秤标签号", example="")
    private String barcodeScaleLabelNum;
    @ApiCloudField(value="批发订货允许超过中心库存.默认null值 不允许。1为允许", example="false")
    private Boolean wholesaleBookAllowOverCenterStock;
    @ApiCloudField(value="最低批发价")
    private BigDecimal wholesaleMinPrice;
    @ApiCloudField(value="物料商品", example="")
    private List<PosItemMaterialVOModel> posItemMaterials;
}
