package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="4344990005004")
    private String outOrderFid;
    @ApiCloudField(value="调入门店编码", example="99")
    private Integer inBranchNum;
    @ApiCloudField(value="调出门店编码", example="1")
    private Integer outBranchNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String outOrderCreator;
    @ApiCloudField(value="备注", example="备注信息")
    private String outOrderMemo;
    @ApiCloudField(value="外部订单号", example="A0005")
    private String outOrderOutBillNo;
    @ApiCloudField(value="部门", example="部门名称")
    private String outOrderDepartment;
    @ApiCloudField(value="业务员", example="管理员")
    private String outOrderProposer;
    @ApiCloudField(value="审核人", example="管理员")
    private String outOrderAuditor;
    @ApiCloudField(value="创建时间(yyyy-mm-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String outOrderCreateTime;
    @ApiCloudField(value="审核时间(yyyy-mm-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String outOrderAuditTime;
    @ApiCloudField(value="调出日期(yyyy-MM-dd)", example="2021-01-01")
    private String outOrderDate;
    @ApiCloudField(value="付款日期(yyyy-MM-dd)", example="2021-01-01")
    private String outOrderPaymentDate;
    @ApiCloudField(value="调入日期(yyyy-MM-dd)", example="2021-01-01")
    private String outOrderInDate;
    @ApiCloudField(value="状态编码", example="1")
    private Integer outOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String outOrderStateName;
    @ApiCloudField(value="调出仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="内部申请单号", example="NS2072010000005")
    private String outOrderInnerBill;
    @ApiCloudField(value="要货单号列表", example="[YH4344010004756,YH4344010004757]")
    private List<String> requestOrderFids;
    @ApiCloudField(value="调出金额（小数点2位）", example="5.0")
    private BigDecimal outOrderTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0")
    private BigDecimal outOrderDiscountMoney;
    @ApiCloudField(value="应付金额（小数点2位）", example="1.0")
    private BigDecimal outOrderDueMoney;
    @ApiCloudField(value="已付金额（小数点2位）", example="1.0")
    private BigDecimal outOrderPaidMoney;
    @ApiCloudField(value="成本金额（小数点2位）", example="1.0")
    private BigDecimal outOrderCostMoney;
    @ApiCloudField(value="扩展字段1", example="扩展字段1")
    private String outOrderExtend1;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String outOrderLastEditTime;
    @ApiCloudField(value="拣货时间", example="2021-01-20 00:00:00")
    private String outOrderPickingTime;
    @ApiCloudField(value="发车时间", example="2021-01-20 00:00:00")
    private String outOrderSendTime;
    @ApiCloudField(value="签收时间", example="2021-01-20 00:00:00")
    private String outOrderSignTime;
    @ApiCloudField(value="结算标志", example="已结算")
    private String outOrderSettlementState;
    @ApiCloudField(value="结算时间", example="2024-05-11 10:37:12")
    private String outOrderSettlementTime;
    @ApiCloudField(value="件数", example="10.0")
    private BigDecimal outOrderUseQty;
    @ApiCloudField(value="门店收货状态", example="")
    private String outOrderReceiveState;
    @ApiCloudField(value="调出单调入状态(0:未调入|1:部分调入|2:全部调入)", example="0")
    private Integer outInState;
    @ApiCloudField(value="明细", example="")
    private List<OutOrderDetailV2DTOModel> outOrderDetails;
}
