package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsItemVO模型
 * WMS商品
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsItemVOModel extends ApiCloudObject {

    @ApiCloudField(value="允许整件打包", example="false")
    private Boolean allowPackaging;
    @ApiCloudField(value="是否附属品", example="false")
    private Boolean belongItemIs;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="成本核算方式", example="先进先出")
    private String dcItemCostMode;
    @ApiCloudField(value="预设皮重数值", example="0.05")
    private BigDecimal defaultTareRate;
    @ApiCloudField(value="免税标记", example="true")
    private Boolean freeTaxFlag;
    @ApiCloudField(value="是否存在供应商", example="true")
    private Boolean hasSupplier;
    @ApiCloudField(value="item_assist_rate_not_null")
    private Integer itemAssistRateNotNull;
    @ApiCloudField(value="商品代码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="商品分类名称", example="护理")
    private String itemCategory;
    @ApiCloudField(value="商品分类代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="成本核算方式", example="中心手工指定")
    private String itemCostMode;
    @ApiCloudField(value="越库参数（供应商分拣)", example="true")
    private Boolean itemCrossing;
    @ApiCloudField(value="商品部门", example="采购部门")
    private String itemDepartment;
    @ApiCloudField(value="隔天配送", example="10")
    private Integer itemDistributionBizdayAdd;
    @ApiCloudField(value="淘汰标记", example="true")
    private Boolean itemEliminateFlag;
    @ApiCloudField(value="库存单位换算率", example="2.0")
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="库存单位", example="公斤")
    private String itemInventoryUnit;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="拣货忽略库存", example="true")
    private Boolean itemPickStockIgnore;
    @ApiCloudField(value="配货忽略库存", example="true")
    private Boolean itemPrepareStockIgnore;
    @ApiCloudField(value="是否隔天", example="true")
    private Boolean itemPurchaseBizday;
    @ApiCloudField(value="隔天采购", example="10")
    private Integer itemPurchaseBizdayAdd;
    @ApiCloudField(value="采购换算率", example="2.0")
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="采购单位", example="件")
    private String itemPurchaseUnit;
    @ApiCloudField(value="商品规格", example="1*500")
    private String itemSpec;
    @ApiCloudField(value="拆零商品", example="true")
    private Boolean itemSplitIs;
    @ApiCloudField(value="休眠标记", example="1")
    private Integer itemStatus;
    @ApiCloudField(value="停购标记", example="true")
    private Boolean itemStockCeaseFlag;
    @ApiCloudField(value="配送单位换算率", example="2.0")
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="配送单位", example="件")
    private String itemTransferUnit;
    @ApiCloudField(value="基本单位", example="件")
    private String itemUnit;
    @ApiCloudField(value="有效天数", example="10")
    private Integer itemValidPeriod;
    @ApiCloudField(value="是否称重", example="true")
    private Boolean itemWeighIs;
    @ApiCloudField(value="整件单位(采购单位|配送单位)", example="采购单位")
    private String itemWholeUnit;
    @ApiCloudField(value="批发单位换算率", example="1.0")
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="批发单位", example="件")
    private String itemWholesaleUnit;
    @ApiCloudField(value="新品标记", example="true")
    private Boolean newTag;
    @ApiCloudField(value="包装规格：(空|固定规格|浮动规格)", example="固定规格")
    private String packSpec;
    @ApiCloudField(value="wms分组名称", example="分组")
    private String posItemCategoryName;
    @ApiCloudField(value="wms分组编码", example="1")
    private Integer posItemCategoryNum;
    @ApiCloudField(value="收货生产日期(允许|提醒|禁止)", example="允许")
    private String receiveLowProductionDateTip;
    @ApiCloudField(value="判断类型 1-库内最早 2-库内最新", example="1")
    private Integer receiveLowProductionJudgeType;
    @ApiCloudField(value="收货皮重开启", example="true")
    private Boolean receiveTare;
    @ApiCloudField(value="split")
    private Boolean split;
    @ApiCloudField(value="是否标品", example="true")
    private Boolean stdFlag;
    @ApiCloudField(value="WMS类型", example="WMS类型")
    private String stdFlagName;
    @ApiCloudField(value="拼音", example="aaaaa")
    private String storeItemPinyin;
    @ApiCloudField(value="供应商配送", example="true")
    private Boolean supplierDistribution;
    @ApiCloudField(value="分拣皮重方式:(1 比例，2 固定)", example="1")
    private Integer tareRule;
    @ApiCloudField(value="皮重新规则1:预设去皮(净重),2:单件皮重", example="1")
    private Integer tareRuleNew;
    @ApiCloudField(value="试销截止日")
    private String testMarketEndDate;
    @ApiCloudField(value="第三方商品类别", example="1")
    private String thirdItemCategory;
    @ApiCloudField(value="第三方商品类别代码", example="1")
    private String thirdItemCategoryCode;
    @ApiCloudField(value="有效天数", example="10")
    private Integer validPeriod;
}
