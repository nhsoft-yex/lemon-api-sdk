package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementRefundRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementRefundRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商预付单号", example="YF4344010000010", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="地址", example="宁波")
    private String preSettlementSupplierAddr;
    @ApiCloudField(value="税务号", example="123")
    private String preSettlementTaxNo;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String preSettlementDate;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String preSettlementPaymentType;
    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="备注", example="备注")
    private String preSettlementMemo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String preSettlementOperator;
    @ApiCloudField(value="退款金额（负数小数点2位）", example="-10.0", required=true)
    private BigDecimal preSettlementPaid;
}
