package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemUpdateDTO模型
 * 商品更新DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编码列表", example="[1]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="是否更新标品标记", example="true")
    private Boolean updateStdFlag;
    @ApiCloudField(value="是否标品", example="true")
    private Boolean stdFlag;
    @ApiCloudField(value="越库参数（供应商分拣)", example="true")
    private Boolean itemCrossing;
    @ApiCloudField(value="需要更新至该类别下", example="4344")
    private Integer updateItemCategoryNum;
    @ApiCloudField(value="包装规格(固定规格|浮动规格)", example="固定规格")
    private String packSpec;
    @ApiCloudField(value="拆零商品", example="true")
    private Boolean itemSplitIs;
    @ApiCloudField(value="允许整件打包", example="false")
    private Boolean allowPackaging;
    @ApiCloudField(value="整件单位(采购单位|配送单位)", example="采购单位")
    private String itemWholeUnit;
    @ApiCloudField(value="拆零单位", example="基本单位")
    private String itemSplitUnit;
    @ApiCloudField(value="是否更新ABC", example="true")
    private Boolean updateItemAbcType;
    @ApiCloudField(value="ABC类(A类|B类|C类)", example="A类")
    private String itemAbcType;
    @ApiCloudField(value="wms过期催销天数", example="10")
    private Integer wmsItemRemindPeriod;
    @ApiCloudField(value="是否更新批次号生成规则", example="true")
    private Boolean updateInventoryLotNumCreateRule;
    @ApiCloudField(value="批次号生成规则(1-生产日期 2-生产日期+时分秒 3-默认当天 4-无批次号)", example="1")
    private Integer inventoryLotNumCreateRule;
    @ApiCloudField(value="启用批次保质期", example="true")
    private Boolean enableLotValidDate;
    @ApiCloudField(value="保质期≤N%是否分拣", example="5")
    private Integer productPickLimit;
    @ApiCloudField(value="允许超量收货(百分比)", example="5")
    private Integer itemAllowOverReceive;
    @ApiCloudField(value="收货系数", example="5")
    private Integer deliveryCoefficient;
    @ApiCloudField(value="上架系数", example="5")
    private Integer shelvesCoefficient;
    @ApiCloudField(value="移库系数", example="5")
    private Integer moveStorehouseCoefficient;
    @ApiCloudField(value="配送系数", example="5")
    private Integer distributionCoefficient;
    @ApiCloudField(value="复核系数", example="5")
    private Integer checkCoefficient;
    @ApiCloudField(value="整件拣货系数", example="5")
    private Integer wholePickingCoefficient;
    @ApiCloudField(value="拆零拣货系数", example="5")
    private Integer splitPickingCoefficient;
    @ApiCloudField(value="整件拣货绩效", example="5.0")
    private BigDecimal wholePickingPerformance;
    @ApiCloudField(value="拆零拣货绩效", example="5.0")
    private BigDecimal splitPickingPerformance;
    @ApiCloudField(value="采购属性(市场自采|供应商直供|直配商品)", example="市场自采")
    private String itemPurchaseModel;
    @ApiCloudField(value="是否称重", example="true")
    private Boolean itemWeighIs;
    @ApiCloudField(value="隔天采购", example="10")
    private Integer itemPurchaseBizdayAdd;
    @ApiCloudField(value="配货忽略库存", example="true")
    private Boolean itemPrepareStockIgnore;
    @ApiCloudField(value="拣货忽略库存", example="true")
    private Boolean itemPickStockIgnore;
    @ApiCloudField(value="供应商配送", example="true")
    private Boolean supplierDistribution;
    @ApiCloudField(value="收货皮重开启", example="true")
    private Boolean receiveTare;
    @ApiCloudField(value="收货皮重规则：(1 比例，2 固定)", example="1")
    private Integer receiveTareRule;
    @ApiCloudField(value="收货皮重数值", example="0.05")
    private BigDecimal receiveTareRate;
    @ApiCloudField(value="分拣皮重方式:(1 比例，2 固定)", example="1")
    private Integer tareRule;
    @ApiCloudField(value="皮重新规则1:预设去皮(净重),2:单件皮重", example="1")
    private Integer tareRuleNew;
    @ApiCloudField(value="预设皮重数值", example="0.05")
    private BigDecimal defaultTareRate;
    @ApiCloudField(value="生鲜分拣系数", example="5")
    private Integer freshPickCoefficient;
    @ApiCloudField(value="生鲜配送系数", example="5")
    private Integer freshDistributionCoefficient;
    @ApiCloudField(value="生鲜出仓系数", example="5")
    private Integer freshAllocationCoefficient;
    @ApiCloudField(value="生鲜收货系数", example="5")
    private Integer freshDeliveryCoefficient;
    @ApiCloudField(value="更新人", example="admin", required=true)
    private String itemVersionOperator;
}
