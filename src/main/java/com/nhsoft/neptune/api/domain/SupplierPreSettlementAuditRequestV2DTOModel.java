package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementAuditRequestV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementAuditRequestV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="pre_settlement_no", example="YF4344010000010", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="供应商编码", example="434400001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
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
    @ApiCloudField(value="预付金额（小数点2位）", example="1.0", required=true)
    private BigDecimal preSettlementPaid;
    @ApiCloudField(value="关联采购订单列表", example="[PO2072990002548]")
    private List<String> purchaseOrderFids;
}
