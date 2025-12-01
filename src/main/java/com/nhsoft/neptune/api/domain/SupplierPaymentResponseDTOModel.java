package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="付款编号", example="SP2072990000035")
    private String paymentNo;
    @ApiCloudField(value="供应商编号", example="207200003")
    private Integer supplierNum;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="银行名称", example="农业银行")
    private String paymentBank;
    @ApiCloudField(value="银行账号", example="65554985621452356")
    private String paymentBankAccount;
    @ApiCloudField(value="付款时间", example="2023-03-22 16:03:54")
    private String paymentDateTime;
    @ApiCloudField(value="付款类型", example="现金")
    private String paymentType;
    @ApiCloudField(value="备注", example="")
    private String paymentMemo;
    @ApiCloudField(value="创建人", example="zxnb")
    private String paymentCreator;
    @ApiCloudField(value="创建时间", example="2023-03-22 16:04:23")
    private String paymentCreateTime;
    @ApiCloudField(value="审核人", example="zxnb")
    private String paymentAuditor;
    @ApiCloudField(value="审核时间", example="2023-03-22 16:04:23")
    private String paymentAuditTime;
    @ApiCloudField(value="状态代码", example="3")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="付款总金额", example="-120.0")
    private BigDecimal paymentTotalMoney;
    @ApiCloudField(value="现金银行编号", example="207200001")
    private Integer accountBankNum;
    @ApiCloudField(value="最后修改时间", example="2023-03-22 16:04:23")
    private String paymentLastEditTime;
    @ApiCloudField(value="最后修改人", example="zxnb")
    private String paymentLastEditor;
    @ApiCloudField(value="预付款金额", example="0.0")
    private BigDecimal paymentPreMoney;
    @ApiCloudField(value="开户名", example="")
    private String supplierBankAccountName;
    @ApiCloudField(value="结算方式", example="")
    private String settlementStyle;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal paymentDiscountMoney;
    @ApiCloudField(value="明细", example="")
    private List<SupplierPaymentDetailResponseDTOModel> settlementPaymentDetails;
}
