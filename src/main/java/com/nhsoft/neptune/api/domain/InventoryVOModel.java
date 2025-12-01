package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryVO模型
 * 库存VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="基本单价", example="1.0")
    private BigDecimal basePrice;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="商品总件数", example="1")
    private BigDecimal baseQtySum;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="临期占比", example="0")
    private BigDecimal guaranteeRate;
    @ApiCloudField(value="库存批次id", example="1")
    private Integer inventoryLnDetailNum;
    @ApiCloudField(value="商品代码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="一品多码", example="[30001]")
    private List<String> itemBars;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="商品分类名称", example="护理")
    private String itemCategoryName;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="成本核算方式", example="中心手工指定")
    private String itemCostMode;
    @ApiCloudField(value="库存数量", example="5.0")
    private BigDecimal itemInventoryQty;
    @ApiCloudField(value="库存件数", example="0")
    private BigDecimal itemInventoryQtySum;
    @ApiCloudField(value="库存单位换算率", example="2.0")
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="库存单位", example="公斤")
    private String itemInventoryUnit;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="汉语拼音", example="CLYH")
    private String itemPinyin;
    @ApiCloudField(value="采购数量", example="10.0")
    private BigDecimal itemPurchaseQty;
    @ApiCloudField(value="采购单位合计", example="0")
    private BigDecimal itemPurchaseQtySum;
    @ApiCloudField(value="采购换算率", example="2.0")
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="采购单位", example="件")
    private String itemPurchaseUnit;
    @ApiCloudField(value="商品规格", example="1*500")
    private String itemSpec;
    @ApiCloudField(value="拆零数量", example="2.0")
    private BigDecimal itemSplitQty;
    @ApiCloudField(value="拆零换算率", example="2.0")
    private BigDecimal itemSplitRate;
    @ApiCloudField(value="拆零单位", example="件")
    private String itemSplitUnit;
    @ApiCloudField(value="状态（待上架、待集货、待发货）", example="待上架")
    private String itemState;
    @ApiCloudField(value="配送数量", example="10.0")
    private BigDecimal itemTransferQty;
    @ApiCloudField(value="配送单位合计", example="10")
    private BigDecimal itemTransferQtySum;
    @ApiCloudField(value="配送单位换算率", example="2.0")
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="配送单位", example="件")
    private String itemTransferUnit;
    @ApiCloudField(value="常用单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="是否称重商品", example="true")
    private Boolean itemWeightIs;
    @ApiCloudField(value="整件数量")
    private Integer itemWholeQty;
    @ApiCloudField(value="整件换算率", example="10.0")
    private BigDecimal itemWholeRate;
    @ApiCloudField(value="整件单位", example="件")
    private String itemWholeUnit;
    @ApiCloudField(value="批发数量", example="2.0")
    private BigDecimal itemWholesaleQty;
    @ApiCloudField(value="批发单位合计", example="1")
    private BigDecimal itemWholesaleQtySum;
    @ApiCloudField(value="批发单位换算率", example="1.0")
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="批发单位", example="件")
    private String itemWholesaleUnit;
    @ApiCloudField(value="批次号", example="20250101")
    private String lotNum;
    @ApiCloudField(value="金额", example="1.0")
    private BigDecimal money;
    @ApiCloudField(value="库位名称", example="zfb集货位")
    private String positionName;
    @ApiCloudField(value="库位ID", example="325704")
    private Integer positionNum;
    @ApiCloudField(value="库位类型", example="发货集货")
    private String positionType;
    @ApiCloudField(value="生产日期", example="Wed Jan 01 08:00:00 CST 2025")
    private String productionDate;
    @ApiCloudField(value="拆零标记", example="true")
    private Boolean splitFlag;
    @ApiCloudField(value="拆零数量", example="11.00件")
    private String splitQtyAndUnit;
    @ApiCloudField(value="停留天数(入库时间到现在)", example="11")
    private Integer stayDay;
    @ApiCloudField(value="在库天数", example="11.0")
    private BigDecimal inWarehouseDays;
    @ApiCloudField(value="库区名称", example="A区")
    private String storehouseAreaName;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库编号", example="9965800001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商名称", example="WMS供应链一号供应商")
    private String supplierName;
    @ApiCloudField(value="供应商编号", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="常用数量", example="11.0")
    private BigDecimal useQty;
    @ApiCloudField(value="常用数量件数", example="10")
    private BigDecimal useQtySum;
    @ApiCloudField(value="常用数量换算率", example="10.0")
    private BigDecimal useRate;
    @ApiCloudField(value="商品有效期", example="100")
    private Integer validDate;
    @ApiCloudField(value="保质期", example="20")
    private Integer validDatePercentage;
    @ApiCloudField(value="整件拆零数量", example="10.00公斤+0.00公斤")
    private String wholeSplitQtyAndUnit;
}
