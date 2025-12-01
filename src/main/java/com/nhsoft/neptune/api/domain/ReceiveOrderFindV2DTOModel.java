package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="收货单号", example="PI2003990000002")
    private String receiveOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String receiveOrderCreator;
    @ApiCloudField(value="收货日期", example="2021-01-20")
    private String receiveOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String receiveOrderMemo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String receiveOrderOperator;
    @ApiCloudField(value="创建时间", example="2021-01-20 00:00:00")
    private String receiveOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String receiveOrderAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-20 00:00:00")
    private String receiveOrderAuditTime;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String receiveOrderLastEditTime;
    @ApiCloudField(value="付款日期", example="2021-01-20 00:00:00")
    private String receiveOrderPaymentDate;
    @ApiCloudField(value="采购订单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="状态代码", example="1")
    private Integer receiveOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String receiveOrderStateName;
    @ApiCloudField(value="订单金额（小数点2位）", example="1.0")
    private BigDecimal receiveOrderTotalMoney;
    @ApiCloudField(value="已结金额（小数点2位）", example="1.0")
    private BigDecimal receiveOrderPaidMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0")
    private BigDecimal receiveOrderDiscountMoney;
    @ApiCloudField(value="应付金额（小数点2位）", example="1.0")
    private BigDecimal receiveOrderDueMoney;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal receiveOrderNoTaxMoney;
    @ApiCloudField(value="收货单外部单号", example="wb202106010001")
    private String receiveOrderOutBillNo;
    @ApiCloudField(value="结算标志", example="已结算")
    private String receiveOrderSettlementState;
    @ApiCloudField(value="结算时间", example="2024-05-11 10:37:12")
    private String receiveOrderSettlementTime;
    @ApiCloudField(value="订单明细", example="")
    private List<ReceiveOrderDetailFindV2DTOModel> receiveOrderDetails;
}
