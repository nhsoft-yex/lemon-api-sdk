package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientSettlementAuditDTO模型
 * 客户结算审核参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientSettlementAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户结算单号", example="RP4344990002262", required=true)
    private String clientSettlementNo;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户编码", example="43440001", required=true)
    private String clientFid;
    @ApiCloudField(value="结算时间 格式：yyyy-MM-dd", example="Mon Jan 01 08:00:00 CST 1990", required=true)
    private String clientSettlementDate;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String clientSettlementPaymentType;
    @ApiCloudField(value="操作人", example="业务员", required=true)
    private String clientSettlementOperator;
    @ApiCloudField(value="参考单据号", example="单据号")
    private String clientSettlementRefBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String clientSettlementMemo;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal clientSettlementTotalMoney;
    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String settlementBank;
    @ApiCloudField(value="账号", example="123")
    private String settlementBankAccount;
    @ApiCloudField(value="结算明细", required=true)
    private List<ClientSettlementDetailDTOModel> clientSettlementDetails;
    @ApiCloudField(value="预收明细")
    private List<ClientPreSettlementDetailDTOModel> preSettlementDetails;
}
