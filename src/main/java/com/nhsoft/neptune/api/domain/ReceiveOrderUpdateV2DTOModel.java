package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="收货单号", example="PI2003990000002", required=true)
    private String receiveOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String receiveOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String receiveOrderMemo;
    @ApiCloudField(value="采购单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="receive_order_bill_no")
    private String receiveOrderBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String receiveOrderEmployee;
    @ApiCloudField(value="收货日期 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String receiveOrderDate;
    @ApiCloudField(value="收货单外部单号", example="wb202106010001")
    private String receiveOrderOutBillNo;
    @ApiCloudField(value="订单明细", example="", required=true)
    private List<ReceiveOrderDetailUpdateV2DTOModel> receiveOrderDetails;
}
