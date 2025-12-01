package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAppointTaskVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAppointTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="预约编号", example="996589925284000001")
    private String supplierAppointTaskFid;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="预约日期", example="20251011")
    private String wmsBizday;
    @ApiCloudField(value="供应商编号", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="供应商代码", example="00011")
    private String supplierCode;
    @ApiCloudField(value="供应商名称", example="WMS供应链一号供应商")
    private String supplierName;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="预约人", example="admin")
    private String appointUser;
    @ApiCloudField(value="作废人", example="admin")
    private String invalidUser;
    @ApiCloudField(value="作废时间")
    private String invalidTime;
    @ApiCloudField(value="预约状态代码", example="3")
    private Integer appointStateCode;
    @ApiCloudField(value="预约状态名称", example="预约成功")
    private String appointStateName;
    @ApiCloudField(value="采购订单编号", example="PO99658990000789")
    private String purchaseOrderFid;
    @ApiCloudField(value="商品种数", example="1")
    private BigDecimal itemCount;
    @ApiCloudField(value="商品常用数量", example="1")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="采购订单常用数量", example="1")
    private BigDecimal purchaseOrderUseQty;
    @ApiCloudField(value="预约数量", example="1")
    private BigDecimal itemDeliveredUseQty;
    @ApiCloudField(value="赠品数量", example="1")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="采购人", example="admin")
    private String purchaseUserName;
    @ApiCloudField(value="预约时间")
    private String appointTime;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="审核时间")
    private String auditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String appointAuditor;
    @ApiCloudField(value="订单短号", example="58686")
    private String shortOrderFid;
    @ApiCloudField(value="卸货方式(自卸|仓卸)", example="自卸")
    private String unloadingType;
    @ApiCloudField(value="作废原因", example="作废")
    private String invalidReason;
    @ApiCloudField(value="状态名称", example="预约成功")
    private String showStateName;
    @ApiCloudField(value="状态代码", example="3")
    private Integer showStateCode;
    @ApiCloudField(value="收货数量", example="1")
    private BigDecimal receiveUseQty;
    @ApiCloudField(value="收货基本数量", example="1")
    private BigDecimal receiveBaseQty;
    @ApiCloudField(value="已预约金额", example="1")
    private BigDecimal itemCountAmount;
    @ApiCloudField(value="商品常用金额", example="1")
    private BigDecimal itemUseQtyAmount;
    @ApiCloudField(value="采购金额", example="1")
    private BigDecimal purchaseUseQtyAmount;
    @ApiCloudField(value="收货金额", example="1")
    private BigDecimal receiveUseQtyAmount;
    @ApiCloudField(value="预约金额", example="1")
    private BigDecimal deliverUseQtyAmount;
    @ApiCloudField(value="赠品金额", example="1")
    private BigDecimal presentUseQtyAmount;
    @ApiCloudField(value="预留金额", example="1")
    private BigDecimal reservedUseQtyAmount;
    @ApiCloudField(value="预约赠品金额", example="1")
    private BigDecimal deliveryPresentUseQtyAmount;
    @ApiCloudField(value="采购数量汇总", example="1")
    private BigDecimal purchaseOrderUseQtySum;
    @ApiCloudField(value="预约数量汇总", example="1")
    private BigDecimal itemDeliveredUseQtySum;
    @ApiCloudField(value="赠品数量汇总", example="1")
    private BigDecimal itemPresentUseQtySum;
    @ApiCloudField(value="预约明细", example="")
    private List<SupplierAppointTaskDetailVOModel> wmsSupplierAppointTaskDetails;
}
