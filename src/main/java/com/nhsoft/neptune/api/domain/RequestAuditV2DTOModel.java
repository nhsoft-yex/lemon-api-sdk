package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestAuditV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestAuditV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004756", required=true)
    private String requestOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String requestOrderOperator;
    @ApiCloudField(value="当前登录门店", example="99")
    private Integer loginBranchNum;
    @ApiCloudField(value="外部编号", example="A0001")
    private String requestOrderRefBillNo;
    @ApiCloudField(value="业务员", example="业务员A")
    private String requestOrderProposer;
    @ApiCloudField(value="备注", example="备注信息")
    private String requestOrderMemo;
    @ApiCloudField(value="配送日期", example="2024-04-03")
    private String requestOrderPurchaseDate;
    @ApiCloudField(value="request_order_fund_apply_id")
    private String requestOrderFundApplyId;
    @ApiCloudField(value="明细", example="", required=true)
    private List<RequestDetailV2DTOModel> requestOrderDetails;
}
