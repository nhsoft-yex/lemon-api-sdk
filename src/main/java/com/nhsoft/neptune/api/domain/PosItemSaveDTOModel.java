package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemSaveDTO模型
 * 商品保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品名称", example="好丽友注心蛋黄派", required=true)
    private String itemName;
    @ApiCloudField(value="商品类型(STANDARD:标准,COMBINED:组合商品,NONE_INVENTORY:非库存商品,DOC_MAKE_COMBINE:制单组合,CUSTOME_COMBINE:自定义组合商品,COMPONENT:成分商品)", example="STANDARD", required=true)
    private String itemType;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品代码(系统配置自动生成后,非必填)", example="000000004")
    private String itemCode;
    @ApiCloudField(value="商品条码(系统配置自动生成后,非必填)", example="2200551")
    private String itemBarcode;
    @ApiCloudField(value="经营方式（ 购销、联营、代销）", example="购销")
    private String itemMethod;
    @ApiCloudField(value="速记码", example="HLYZXDHP")
    private String storeItemPinyin;
    @ApiCloudField(value="零售单位", example="公斤", required=true)
    private String itemUnit;
    @ApiCloudField(value="商品类别名称", example="水果", required=true)
    private String itemCategory;
    @ApiCloudField(value="最低售价（小数点2位）", example="11.0")
    private BigDecimal itemMinPrice;
    @ApiCloudField(value="最高售价（小数点2位）", example="20.0")
    private BigDecimal itemMaxPrice;
    @ApiCloudField(value="商品部门", example="水果部门", required=true)
    private String itemDepartment;
    @ApiCloudField(value="是否停售", example="true")
    private Boolean itemSaleCeaseFlag;
    @ApiCloudField(value="停购标记", example="true")
    private Boolean itemStockCeaseFlag;
    @ApiCloudField(value="是否启用积分", example="true")
    private Boolean itemPointActived;
    @ApiCloudField(value="积分值（小数点2位）", example="10.0")
    private BigDecimal itemPointValue;
    @ApiCloudField(value="品牌", example="品牌名称")
    private String itemBrand;
    @ApiCloudField(value="采购范围（ 不限、总部购配、门店采购、总订店收、自产）", example="自产")
    private String itemPurchaseScope;
    @ApiCloudField(value="成本核算方式（加权平均法、先进先出法、手工指定、中心手工指定）", example="加权平均法")
    private String itemCostMode;
    @ApiCloudField(value="有效天数", example="10")
    private Integer itemValidPeriod;
    @ApiCloudField(value="进货价（小数点8位）", example="10.0", required=true)
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="配送价（小数点4位）", example="20.0", required=true)
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="辅助数量", example="10.0")
    private String itemAssistUnit;
    @ApiCloudField(value="辅助单位换算率（小数点3位）", example="0.9")
    private BigDecimal itemAssistRate;
    @ApiCloudField(value="休眠标记(0正常，1休眠)", example="1")
    private Integer itemStatus;
    @ApiCloudField(value="允许前台折扣", example="true")
    private Boolean itemDiscounted;
    @ApiCloudField(value="产地", example="江苏南京")
    private String itemPlace;
    @ApiCloudField(value="过期催销天数", example="10")
    private Integer itemRemindPeriod;
    @ApiCloudField(value="仓储位置", example="南京市建邺区")
    private String itemStorePlace;
    @ApiCloudField(value="进项税（小数点2位，页面显示是带%）", example="1.0")
    private BigDecimal itemInTax;
    @ApiCloudField(value="出项税（小数点2位，页面显示是带%）", example="1.0")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="商品称重标记", example="true")
    private Boolean itemWeightFlag;
    @ApiCloudField(value="商品标签", example="[水果, 品牌]")
    private List<String> itemLabelNames;
    @ApiCloudField(value="pos_item_matrix")
    private PosItemMatrixSaveVOModel posItemMatrix;
    @ApiCloudField(value="标准售价", example="20.0", required=true)
    private BigDecimal itemRegularPrice;
    @ApiCloudField(value="采购单位", example="公斤", required=true)
    private String itemPurchaseUnit;
    @ApiCloudField(value="采购换算率（小数点3位）", example="0.9", required=true)
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="库存单位", example="公斤", required=true)
    private String itemInventoryUnit;
    @ApiCloudField(value="商品批发价（小数点4位）", example="20.0")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="库存换算率（小数点3位）", example="0.9", required=true)
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="配送单位", example="公斤", required=true)
    private String itemTransferUnit;
    @ApiCloudField(value="配送换算率（小数点3位）", example="0.8", required=true)
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="批发单位", example="公斤", required=true)
    private String itemWholesaleUnit;
    @ApiCloudField(value="批发换算率（小数点3位）", example="0.8", required=true)
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="打印价签", example="true")
    private Boolean itemPriceTagFlag;
    @ApiCloudField(value="前台打印标签", example="true")
    private Boolean itemPrintLabelFlag;
    @ApiCloudField(value="一品多码")
    private List<PosItemBarCodeSaveVOModel> itemBars;
    @ApiCloudField(value="组合明细")
    private List<PosItemCombineItemSaveVOModel> posItemCombineItems;
    @ApiCloudField(value="规格明细")
    private List<PosItemSpecSaveVOModel> posItemSpecs;
    @ApiCloudField(value="是否允许门店调价 1 不允许 2 允许", example="1")
    private Integer itemPriceAdj;
    @ApiCloudField(value="是否允许负库存销售", example="true")
    private Boolean itemSaleNoStore;
    @ApiCloudField(value="税收编码", example="1030202010000000000")
    private String itemTaxCode;
    @ApiCloudField(value="收货单需要输入生产日期(0不开启，1开启)", example="true")
    private Boolean itemNeedProductDate;
    @ApiCloudField(value="要货不允许超过中心库存", example="true")
    private Boolean noStockNoRequest;
    @ApiCloudField(value="是否加工商品", example="false")
    private Boolean itemManufactureFlag;
    @ApiCloudField(value="配送毛利加点", example="0.1")
    private BigDecimal itemTransferGross;
    @ApiCloudField(value="是否锁定配送毛利加点", example="true")
    private Boolean itemTransferFixedGross;
    @ApiCloudField(value="批发毛利加点", example="0.1")
    private BigDecimal itemWholesaleGross;
    @ApiCloudField(value="是否锁定批发毛利加点", example="true")
    private Boolean itemWholesaleFixedGross;
    @ApiCloudField(value="锁定配送毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemTransferFixType;
    @ApiCloudField(value="锁定批发毛利加点类型（1-按比例，2-按金额）", example="1")
    private Integer itemWholesaleFixType;
    @ApiCloudField(value="pos_item_commission")
    private PosItemCommissionSaveVOModel posItemCommission;
    @ApiCloudField(value="允许门店退货", example="false")
    private Boolean itemTransferReturnFlag;
}
