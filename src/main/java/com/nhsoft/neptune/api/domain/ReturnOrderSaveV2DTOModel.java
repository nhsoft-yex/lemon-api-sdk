package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReturnOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String returnOrderOperator;
    @ApiCloudField(value="收货单号", example="PI2003990000002")
    private String receiveOrderFid;
    @ApiCloudField(value="备注", example="备注信息")
    private String returnOrderMemo;
    @ApiCloudField(value="return_order_bill_no")
    private String returnOrderBillNo;
    @ApiCloudField(value="外部流水号(长度小于50)", example="A00001")
    private String returnOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String returnOrderEmployee;
    @ApiCloudField(value="退货日期（yyyy-MM-dd）", example="2021-01-20", required=true)
    private String returnOrderDate;
    @ApiCloudField(value="退货明细", example="", required=true)
    private List<ReturnOrderSaveDetailV2DTOModel> returnOrderDetails;
    @ApiCloudField(value="enable_custom_time")
    private Boolean enableCustomTime;
    @ApiCloudField(value="return_order_create_time")
    private String returnOrderCreateTime;
    @ApiCloudField(value="return_order_last_edit_time")
    private String returnOrderLastEditTime;
    @ApiCloudField(value="return_order_audit_time")
    private String returnOrderAuditTime;
    @ApiCloudField(value="return_order_payment_date")
    private String returnOrderPaymentDate;
}
