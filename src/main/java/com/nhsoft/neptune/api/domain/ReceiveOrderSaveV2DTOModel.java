package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String receiveOrderOperator;
    @ApiCloudField(value="采购单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="备注", example="备注信息")
    private String receiveOrderMemo;
    @ApiCloudField(value="receive_order_bill_no")
    private String receiveOrderBillNo;
    @ApiCloudField(value="业务员", example="业务员名称", required=true)
    private String receiveOrderEmployee;
    @ApiCloudField(value="收货日期 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String receiveOrderDate;
    @ApiCloudField(value="收货单外部单号", example="wb202106010001")
    private String receiveOrderOutBillNo;
    @ApiCloudField(value="订单明细", example="", required=true)
    private List<ReceiveOrderDetailSaveV2DTOModel> receiveOrderDetails;
    @ApiCloudField(value="enable_custom_time")
    private Boolean enableCustomTime;
    @ApiCloudField(value="receive_order_create_time")
    private String receiveOrderCreateTime;
    @ApiCloudField(value="receive_order_last_edit_time")
    private String receiveOrderLastEditTime;
    @ApiCloudField(value="receive_order_audit_time")
    private String receiveOrderAuditTime;
    @ApiCloudField(value="receive_order_payment_date")
    private String receiveOrderPaymentDate;
}
