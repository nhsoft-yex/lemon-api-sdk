package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveTaskVO模型
 * 收货任务VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="收货状态", example="部分收获")
    private String appReceiveState;
    @ApiCloudField(value="基本单价", example="10.0")
    private BigDecimal basePrice;
    @ApiCloudField(value="营业日", example="20250301")
    private String bizday;
    @ApiCloudField(value="完成时间")
    private String completeTime;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="操作门店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="截止日期")
    private String deadline;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String defaultStorehouseName;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer defaultStorehouseNum;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="商品规格", example="1*500")
    private String itemSpec;
    @ApiCloudField(value="商品条码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="商品代码", example="30005")
    private String itemCode;
    @ApiCloudField(value="成本核算方式", example="中心手工指定")
    private String itemCostMode;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemBaseUnit;
    @ApiCloudField(value="商品分类名称", example="护理")
    private String itemCategoryName;
    @ApiCloudField(value="商品分类代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="商品部门", example="1")
    private String itemDepartment;
    @ApiCloudField(value="扩展字段1", example="1")
    private String itemExtend1;
    @ApiCloudField(value="扩展字段2", example="1")
    private String itemExtend2;
    @ApiCloudField(value="扩展字段3", example="1")
    private String itemExtend3;
    @ApiCloudField(value="库存单位换算率", example="2.0")
    private BigDecimal itemInventoryRate;
    @ApiCloudField(value="库存单位", example="公斤")
    private String itemInventoryUnit;
    @ApiCloudField(value="赠品基本数量", example="1.0")
    private BigDecimal itemPresentBaseQty;
    @ApiCloudField(value="赠品常用数量", example="1.0")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="采购换算率", example="1.0")
    private BigDecimal itemPurchaseRate;
    @ApiCloudField(value="采购单位", example="件")
    private String itemPurchaseUnit;
    @ApiCloudField(value="分割品标记", example="true")
    private Boolean itemSplitFlag;
    @ApiCloudField(value="商品规格", example="0*0")
    private String itemTiHi;
    @ApiCloudField(value="配送单位换算率", example="2.0")
    private BigDecimal itemTransferRate;
    @ApiCloudField(value="配送单位", example="件")
    private String itemTransferUnit;
    @ApiCloudField(value="常用单位", example="件")
    private String itemUseUnit;
    @ApiCloudField(value="是否称重商品", example="true")
    private Boolean itemWeightIs;
    @ApiCloudField(value="批发单位换算率", example="1.0")
    private BigDecimal itemWholesaleRate;
    @ApiCloudField(value="批发单位", example="件")
    private String itemWholesaleUnit;
    @ApiCloudField(value="上次收货时间")
    private String lastReceiveTime;
    @ApiCloudField(value="收货人名称", example="admin")
    private String lastReceiveUserName;
    @ApiCloudField(value="计划基本数量", example="10.0")
    private BigDecimal planBaseQty;
    @ApiCloudField(value="计划常用数量", example="10.0")
    private BigDecimal planUseQty;
    @ApiCloudField(value="赠品基本数量", example="10.0")
    private BigDecimal presentBaseQty;
    @ApiCloudField(value="赠品常用数量", example="10.0")
    private BigDecimal presentUseQty;
    @ApiCloudField(value="实收基本数量", example="10.0")
    private BigDecimal realBaseQty;
    @ApiCloudField(value="实收常用数量", example="10.0")
    private BigDecimal realUseQty;
    @ApiCloudField(value="收货基本数量", example="10.0")
    private BigDecimal receiveBaseQty;
    @ApiCloudField(value="合计收货基本数量", example="12.0")
    private BigDecimal receiveBaseQtyWithPresent;
    @ApiCloudField(value="是否完成回传", example="true")
    private Boolean receiveCompleteConfirm;
    @ApiCloudField(value="是否完成回传", example="是")
    private String receiveCompleteConfirmStateName;
    @ApiCloudField(value="收货状态 (未收货、部分收货、全部收货、已入库)", example="未收货")
    private String receiveState;
    @ApiCloudField(value="收货任务编号", example="SR996589925063000001")
    private String receiveTaskFid;
    @ApiCloudField(value="收货常用数量", example="10.0")
    private BigDecimal receiveUseQty;
    @ApiCloudField(value="收货合计赠品常用数量", example="10.0")
    private BigDecimal receiveUseQtyWithPresent;
    @ApiCloudField(value="单据状态编码", example="3")
    private Integer stateCode;
    @ApiCloudField(value="单据状态", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="供应商代码", example="001")
    private String supplierCode;
    @ApiCloudField(value="供应商名称", example="供应商")
    private String supplierName;
    @ApiCloudField(value="供应商编码", example="10001")
    private Integer supplierNum;
    @ApiCloudField(value="是否忽略", example="true")
    private Boolean taskIgnore;
    @ApiCloudField(value="总金额", example="50.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="卸货方式", example="自卸")
    private String unloadingType;
    @ApiCloudField(value="单价", example="10.0")
    private BigDecimal usePrice;
    @ApiCloudField(value="换算率", example="2.0")
    private BigDecimal useRate;
    @ApiCloudField(value="保质期天数", example="100")
    private Integer validDate;
    @ApiCloudField(value="明细编号", example="1")
    private Integer warehouseBookOrderDetailNum;
    @ApiCloudField(value="出库订单编号", example="RD996589925070000001")
    private String warehouseBookOrderFid;
    @ApiCloudField(value="入库订单类型", example="供应商供货")
    private String warehouseBookType;
    @ApiCloudField(value="收货任务详情")
    private List<ReceiveTaskDetailVOModel> wmsStdReceiveTaskDetailList;
}
