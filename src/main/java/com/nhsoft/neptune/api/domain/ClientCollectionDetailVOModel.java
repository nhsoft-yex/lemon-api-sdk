package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionDetailVO模型
 * 客户收款明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户结算单号", example="RP4344990002262")
    private String clientSettlementNo;
    @ApiCloudField(value="客户编号", example="43440001")
    private String clientFid;
    @ApiCloudField(value="客户名称", example="客户A")
    private String clientName;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="结算日期", example="Fri Sep 10 08:00:00 CST 2021")
    private String clientSettlementDate;
    @ApiCloudField(value="付款方式", example="现金")
    private String clientSettlementPaymentType;
    @ApiCloudField(value="备注", example="备注")
    private String clientSettlementMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String clientSettlementCreator;
    @ApiCloudField(value="创建时间")
    private String clientSettlementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String clientSettlementAuditor;
    @ApiCloudField(value="审核时间")
    private String clientSettlementAuditTime;
    @ApiCloudField(value="最后修改时间")
    private String clientSettlementLastEditTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer clientSettlementStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String clientSettlementStateName;
    @ApiCloudField(value="合同单据号", example="AG434401000014")
    private String clientSupplierAgreementNo;
    @ApiCloudField(value="合同类型", example="联营")
    private String clientAgreementDetailType;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String clientSettlementBank;
    @ApiCloudField(value="账号", example="123")
    private String clientSettlementBankAccount;
    @ApiCloudField(value="现金银行", example="新现金银行")
    private String clientSettlementAccountBank;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0")
    private BigDecimal clientSettlementTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="5.0")
    private BigDecimal clientSettlementTotalDiscount;
    @ApiCloudField(value="结算明细单", example="95")
    private List<ClientSettlementDetailVOModel> settlementDetails;
    @ApiCloudField(value="预收明细", example="预收明细")
    private List<ClientPreSettlementDetailVOModel> preSettlementDetails;
    @ApiCloudField(value="收款明细编号", example="1")
    private Integer detailNum;
}
