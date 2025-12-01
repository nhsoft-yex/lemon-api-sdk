package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementSettlementResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementSettlementResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商合同结算单号", example="AG9999101001931")
    private String agreementSettlementNo;
    @ApiCloudField(value="合同单据号", example="9999101003409")
    private String agreementNo;
    @ApiCloudField(value="合同名称", example="结算合同")
    private String agreementName;
    @ApiCloudField(value="合同类型", example="合同类型")
    private String agreementType;
    @ApiCloudField(value="供应商编码", example="999910361")
    private Integer supplierNum;
    @ApiCloudField(value="结算日期", example="2022-01-01")
    private String settlementDate;
    @ApiCloudField(value="结算起始日期", example="2022-01-01 10:00:00")
    private String settlementStartDate;
    @ApiCloudField(value="结算结束日期", example="2022-02-01 10:00:00")
    private String settlementEndDate;
    @ApiCloudField(value="应付金额", example="200.0")
    private BigDecimal settlementPaidMoney;
    @ApiCloudField(value="销售成本", example="100.0")
    private BigDecimal settlementSaleCostMoney;
    @ApiCloudField(value="结算金额", example="200.0")
    private BigDecimal settlementTotalMoney;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal settlementTotalDiscount;
    @ApiCloudField(value="单据金额", example="300.0")
    private BigDecimal settlementOrderMoney;
    @ApiCloudField(value="扣点金额", example="0.0")
    private BigDecimal settlementPointMoney;
    @ApiCloudField(value="费用金额", example="0.0")
    private BigDecimal settlementOtherInoutMoney;
    @ApiCloudField(value="扣补金额", example="0.0")
    private BigDecimal settlementMakeOrderMoney;
    @ApiCloudField(value="结算明细", example="")
    private List<SupplierSettlementDetailResponseDTOModel> details;
}
