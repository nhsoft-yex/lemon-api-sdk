package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderFindV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderFindV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="采购订单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String purchaseOrderCreator;
    @ApiCloudField(value="采购日期", example="2021-01-20")
    private String purchaseOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String purchaseOrderMemo;
    @ApiCloudField(value="外部流水号(即将废弃，使用新字段:purchase_order_out_bill_no)", example="A0001")
    private String purchaseOrderBillNo;
    @ApiCloudField(value="外部流水号", example="A0001")
    private String purchaseOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String purchaseOrderOperator;
    @ApiCloudField(value="创建时间", example="2021-01-20 00:00:00")
    private String purchaseOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String purchaseOrderAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-20 00:00:00")
    private String purchaseOrderAuditTime;
    @ApiCloudField(value="作废时间", example="2021-01-20 00:00:00")
    private String purchaseOrderCancelTime;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String purchaseOrderLastEditTime;
    @ApiCloudField(value="交货期限", example="2021-01-20")
    private String purchaseOrderDeadline;
    @ApiCloudField(value="状态代码", example="1")
    private Integer purchaseOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String purchaseOrderStateName;
    @ApiCloudField(value="订单金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderTotalMoney;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderNoTaxMoney;
    @ApiCloudField(value="供应商平台 处理状态", example="已处理")
    private String purchaseOrderLabel;
    @ApiCloudField(value="供应商平台 打印次数", example="0")
    private Integer purchaseOrderSupplierPrintCount;
    @ApiCloudField(value="收货状态（未收货，部分收货，全部收货）", example="全部收货")
    private String purchaseOrderReceiveState;
    @ApiCloudField(value="预付金额", example="100")
    private BigDecimal purchaseOrderPreMoney;
    @ApiCloudField(value="订单明细", example="")
    private List<PurchaseOrderFindDetailV3DTOModel> purchaseOrderDetails;
}
