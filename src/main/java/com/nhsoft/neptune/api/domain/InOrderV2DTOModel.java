package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入单号", example="MI4344980000013")
    private String inOrderFid;
    @ApiCloudField(value="调入门店编码", example="99")
    private Integer inBranchNum;
    @ApiCloudField(value="调出门店编码", example="1")
    private Integer outBranchNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String inOrderCreator;
    @ApiCloudField(value="备注", example="备注信息")
    private String inOrderMemo;
    @ApiCloudField(value="外部订单号", example="A0005")
    private String inOrderOutBillNo;
    @ApiCloudField(value="业务员", example="管理员")
    private String inOrderProposer;
    @ApiCloudField(value="审核人", example="管理员")
    private String inOrderAuditor;
    @ApiCloudField(value="创建时间(yyyy-mm-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String inOrderCreateTime;
    @ApiCloudField(value="审核时间(yyyy-mm-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String inOrderAuditTime;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String inOrderLastEditTime;
    @ApiCloudField(value="调入日期(yyyy-MM-dd)", example="2021-01-01")
    private String inOrderDate;
    @ApiCloudField(value="状态编码", example="1")
    private Integer inOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String inOrderStateName;
    @ApiCloudField(value="调入仓库编码", example="1")
    private Integer storehouseNum;
    @ApiCloudField(value="关联调出单号", example="MO4344990004989")
    private String outOrderFid;
    @ApiCloudField(value="内部申请单号", example="NS99676990000050")
    private String inOrderInnerBill;
    @ApiCloudField(value="调入金额（小数点2位）", example="5.0")
    private BigDecimal inOrderTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0")
    private BigDecimal inOrderDiscountMoney;
    @ApiCloudField(value="应付金额（小数点2位）", example="1.0")
    private BigDecimal inOrderDueMoney;
    @ApiCloudField(value="已付金额（小数点2位）", example="1.0")
    private BigDecimal inOrderPaidMoney;
    @ApiCloudField(value="成本金额")
    private BigDecimal inOrderTotalCost;
    @ApiCloudField(value="结算标志", example="已结算")
    private String inOrderSettlementState;
    @ApiCloudField(value="结算时间", example="2024-05-11 10:37:12")
    private String inOrderSettlementTime;
    @ApiCloudField(value="签收时间", example="2024-05-11 10:37:12")
    private String inOrderSignTime;
    @ApiCloudField(value="明细", example="")
    private List<InOrderDetailV2DTOModel> inOrderDetails;
}
