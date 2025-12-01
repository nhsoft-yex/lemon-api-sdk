package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSettlementUpdateRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSettlementUpdateRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店结算单号", example="ZP4344990002329", required=true)
    private String innerSettlementNo;
    @ApiCloudField(value="结算时间 格式：yyyy-MM-dd", example="1990-01-01", required=true)
    private String innerSettlementDate;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String innerSettlementPaymentType;
    @ApiCloudField(value="操作人", example="业务员", required=true)
    private String innerSettlementOperator;
    @ApiCloudField(value="参考单据号", example="单据号")
    private String innerSettlementRefBillNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerSettlementMemo;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal innerSettlementTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="0.0", required=true)
    private BigDecimal innerSettlementTotalDiscount;
    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="结算明细", example="", required=true)
    private List<InnerSettlementDetailRequestDTOModel> innerSettlementDetails;
    @ApiCloudField(value="预收明细", example="")
    private List<InnerPreSettlementDetailRequestDTOModel> preSettlementDetails;
}
