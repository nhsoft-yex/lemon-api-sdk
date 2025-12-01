package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReturnOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="退货单号", example="RO2072010000002")
    private String returnOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String returnOrderCreator;
    @ApiCloudField(value="退货日期（yyyy-mm-dd）", example="2021-01-20")
    private String returnOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String returnOrderMemo;
    @ApiCloudField(value="外部流水号", example="A00001")
    private String returnOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String returnOrderOperator;
    @ApiCloudField(value="创建时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String returnOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String returnOrderAuditor;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String returnOrderAuditTime;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String returnOrderLastEditTime;
    @ApiCloudField(value="付款日期（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String returnOrderPaymentDate;
    @ApiCloudField(value="收货订单号", example="PI2003990000002")
    private String receiveOrderFid;
    @ApiCloudField(value="状态编码", example="1")
    private Integer returnOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String returnOrderStateName;
    @ApiCloudField(value="退货金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderTotalMoney;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderNoTaxMoney;
    @ApiCloudField(value="已结金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderPaidMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderDiscountMoney;
    @ApiCloudField(value="应付金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderDueMoney;
    @ApiCloudField(value="结算标志", example="已结算")
    private String returnOrderSettlementState;
    @ApiCloudField(value="结算时间", example="2024-05-11 10:37:12")
    private String returnOrderSettlementDate;
    @ApiCloudField(value="退货方式", example="")
    private String returnType;
    @ApiCloudField(value="退货明细", example="")
    private List<ReturnOrderDetailV2DTOModel> returnOrderDetails;
}
