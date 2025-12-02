package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveApplyOrderSaveDTO模型
 * 收款冻结单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveApplyOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型（CARD|GOODS|FEE_OTHER|FEE）", example="GOODS", required=true)
    private String businessType;
    @ApiCloudField(value="快速生成单据类型（ORDER_TYPE_CALLIN|ORDER_TYPE_CALLOUT|ORDER_TYPE_DISTRIBUTOR|ORDER_TYPE_SUPPLIER_FEE_PAYABLE|ORDER_TYPE_SUPPLIER_FEE_RECEIVABLE|ORDER_TYPE_POS|ORDER_TYPE_RECEIVE|ORDER_TYPE_RETURN|ORDER_TYPE_WHOLESALE_SALE|ORDER_TYPE_WHOLESALE_RETURN|ORDER_TYPE_SETTLEMENT_SUPPLIER_GOODS|ORDER_TYPE_OUT_FEE|ORDER_TYPE_PAYABLE_FEE|ORDER_TYPE_RECEIVABLE_FEE）", example="ORDER_TYPE_PAYABLE_FEE", required=true)
    private String quickOrderType;
    @ApiCloudField(value="目标用户中心门店ID", example="1")
    private String dstBranchId;
    @ApiCloudField(value="目标用户中心合作伙伴ID", example="1")
    private String dstPartnerId;
    @ApiCloudField(value="源用户中心门店", example="1", required=true)
    private String srcBranchId;
    @ApiCloudField(value="业务时间", example="2022-01-01 00:00:00", required=true)
    private String date;
    @ApiCloudField(value="截止时间", example="2022-01-01 00:00:00", required=true)
    private String deadline;
    @ApiCloudField(value="金额", example="100.0", required=true)
    private BigDecimal totalAmount;
    @ApiCloudField(value="外部单据号", example="PI43440000001", required=true)
    private String refBillNo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<ReceiveApplyOrderDetailSaveDTOModel> receivableOrderDetails;
}
