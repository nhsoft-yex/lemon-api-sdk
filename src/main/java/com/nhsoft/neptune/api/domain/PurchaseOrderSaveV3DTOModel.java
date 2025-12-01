package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderSaveV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderSaveV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String purchaseOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String purchaseOrderMemo;
    @ApiCloudField(value="外部流水号(长度小于50个字符)(该字段即将废弃,后续使用新字段 purchase_order_out_bill_no)", example="A0001")
    private String purchaseOrderBillNo;
    @ApiCloudField(value="外部流水号(长度小于50个字符)", example="A0001")
    private String purchaseOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String purchaseOrderEmployee;
    @ApiCloudField(value="采购日期 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String purchaseOrderDate;
    @ApiCloudField(value="交货期限 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String purchaseOrderDeadline;
    @ApiCloudField(value="订单明细", example="", required=true)
    private List<PurchaseOrderDetailSaveV3DTOModel> purchaseOrderDetails;
    @ApiCloudField(value="request_order_fids")
    private List<String> requestOrderFids;
}
