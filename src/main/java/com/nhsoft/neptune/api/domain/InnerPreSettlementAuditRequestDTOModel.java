package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerPreSettlementAuditRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerPreSettlementAuditRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店预收单号", example="YS4344010000010", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="收款门店编码", example="99", required=true)
    private Integer centerBranchNum;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String preSettlementDate;
    @ApiCloudField(value="付款时间 格式：HH:mm:ss，不传时间则使用日期，传时间则拼接", example="10:00:00")
    private String preSettlementTime;
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
    @ApiCloudField(value="关联要货单号列表", example="[YH203099004]")
    private List<String> requestOrderFids;
}
