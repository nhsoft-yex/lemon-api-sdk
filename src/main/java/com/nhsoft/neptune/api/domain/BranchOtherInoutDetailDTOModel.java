package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchOtherInoutDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchOtherInoutDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店结算单号", example="ZP4344990002262")
    private String innerSettlementNo;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="审核时间 格式：yyyy-MM-dd HH:MM:SS", example="2021-01-01 00:00:00")
    private String innerSettlementAuditTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String innerSettlementAuditor;
    @ApiCloudField(value="实收金额（小数点2位）", example="100.0")
    private BigDecimal innerSettlementTotalMoney;
    @ApiCloudField(value="优惠金额（小数点2位）", example="100.0")
    private BigDecimal innerSettlementTotalDiscount;
    @ApiCloudField(value="付款方式", example="现金")
    private String innerSettlementPaymentType;
    @ApiCloudField(value="备注", example="中心结算")
    private String innerSettlementMemo;
}
