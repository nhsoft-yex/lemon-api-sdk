package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSettlementResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSettlementResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店结算单号", example="ZP4344990002262")
    private String innerSettlementNo;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="结算时间 格式：yyyy-MM-dd", example="2021-01-01")
    private String innerSettlementDate;
    @ApiCloudField(value="付款方式", example="现金")
    private String innerSettlementPaymentType;
    @ApiCloudField(value="参考单据号", example="参考单据号")
    private String innerSettlementRefBillNo;
    @ApiCloudField(value="状态代码", example="1")
    private Integer innerSettlementStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String innerSettlementStateName;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0")
    private BigDecimal innerSettlementTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="0.0")
    private BigDecimal innerSettlementTotalDiscount;
    @ApiCloudField(value="现金银行编号", example="123")
    private Integer accountBankNum;
    @ApiCloudField(value="结算明细", example="")
    private List<InnerSettlementDetailResponseDTOModel> innerSettlementDetails;
    @ApiCloudField(value="预收明细", example="")
    private List<InnerPreSettlementDetailResponseDTOModel> innerPreSettlementDetail;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerSettlementMemo;
    @ApiCloudField(value="创建人", example="业务员")
    private String innerSettlementCreator;
    @ApiCloudField(value="创建时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-01 10:00:00")
    private String innerSettlementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String innerSettlementAuditor;
    @ApiCloudField(value="审核时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-01 10:00:00")
    private String innerSettlementAuditTime;
    @ApiCloudField(value="最后修改人", example="管理员")
    private String innerSettlementLastEditor;
    @ApiCloudField(value="最后修改时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-01 10:00:00")
    private String innerSettlementLastEditTime;
}
