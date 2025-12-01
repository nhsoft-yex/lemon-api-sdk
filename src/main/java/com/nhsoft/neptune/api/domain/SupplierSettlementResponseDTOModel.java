package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商结算单号", example="CP4344990002262")
    private String supplierSettlementNo;
    @ApiCloudField(value="供应商编码", example="43440001")
    private Integer supplierNum;
    @ApiCloudField(value="供应商名称", example="供应商A")
    private String supplierName;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="结算日期", example="2021-09-10 00:00:00")
    private String settlementDate;
    @ApiCloudField(value="付款方式", example="现金")
    private String settlementPaymentType;
    @ApiCloudField(value="备注", example="备注")
    private String settlementMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String settlementCreator;
    @ApiCloudField(value="创建时间", example="2021-01-27 00:00:00")
    private String settlementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String settlementAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-27 00:00:00")
    private String settlementAuditTime;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String settlementLastEditTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer settlementStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String settlementStateName;
    @ApiCloudField(value="合同单据号", example="AG434401000014")
    private String supplierAgreementNo;
    @ApiCloudField(value="合同类型", example="联营")
    private String agreementDetailType;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String settlementBank;
    @ApiCloudField(value="账号", example="123")
    private String settlementBankAccount;
    @ApiCloudField(value="开户名", example="开户名")
    private String settlementBankName;
    @ApiCloudField(value="现金银行", example="新现金银行")
    private String settlementAccountBank;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0")
    private BigDecimal settlementTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="5.0")
    private BigDecimal settlementTotalDiscount;
    @ApiCloudField(value="业务金额（小数点2位）", example="95.0")
    private BigDecimal settlementOrderMoney;
    @ApiCloudField(value="扣点金额（小数点2位）", example="1.0")
    private BigDecimal settlementPointMoney;
    @ApiCloudField(value="应付金额（小数点2位）", example="94.0")
    private BigDecimal settlementPaidMoney;
    @ApiCloudField(value="付款金额（小数点2位）", example="94.0")
    private BigDecimal settlementPaymentMoney;
    @ApiCloudField(value="扣补金额（小数点2位）", example="2.0")
    private BigDecimal settlementMakeOrderMoney;
    @ApiCloudField(value="其他收支金额（小数点2位）", example="2.0")
    private BigDecimal settlementOtherInoutMoney;
    @ApiCloudField(value="销售成本金额（小数点2位）", example="95.0")
    private BigDecimal settlementSaleCostMoney;
    @ApiCloudField(value="结算明细单", example="95")
    private List<SupplierSettlementDetailResponseDTOModel> settlementDetails;
    @ApiCloudField(value="预付明细", example="预付明细")
    private List<SupplierPreSettlementDetailResponseDTOModel> preSettlementDetails;
}
