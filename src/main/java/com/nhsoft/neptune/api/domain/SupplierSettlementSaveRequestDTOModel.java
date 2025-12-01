package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementSaveRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementSaveRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="供应商编码", example="43440001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="结算时间 格式：yyyy-MM-dd", example="1990-01-01", required=true)
    private String supplierSettlementDate;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String supplierSettlementPaymentType;
    @ApiCloudField(value="操作人", example="业务员", required=true)
    private String supplierSettlementOperator;
    @ApiCloudField(value="参考单据号", example="单据号")
    private String supplierSettlementRefBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String supplierSettlementMemo;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal supplierSettlementTotalMoney;
    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String settlementBank;
    @ApiCloudField(value="账号", example="123")
    private String settlementBankAccount;
    @ApiCloudField(value="结算明细", example="", required=true)
    private List<SupplierSettlementDetailRequestDTOModel> supplierSettlementDetails;
    @ApiCloudField(value="预收明细", example="")
    private List<SupplierPreSettlementDetailRequestDTOModel> preSettlementDetails;
}
