package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerPreSettlementResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerPreSettlementResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店预收单号", example="YS4344010000010")
    private String preSettlementNo;
    @ApiCloudField(value="收款门店编码", example="1")
    private Integer centerBranchNum;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String preSettlementBank;
    @ApiCloudField(value="银行账号", example="123")
    private String preSettlementBankAccount;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd", example="2021-01-20")
    private String preSettlementDate;
    @ApiCloudField(value="付款时间 格式：HH:mm:ss", example="12:00:00")
    private String preSettlementTime;
    @ApiCloudField(value="付款方式", example="现金")
    private String preSettlementPaymentType;
    @ApiCloudField(value="备注", example="备注")
    private String preSettlementMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String preSettlementCreator;
    @ApiCloudField(value="创建时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-20 00:00:00")
    private String preSettlementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String preSettlementAuditor;
    @ApiCloudField(value="审核时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-20 00:00:00")
    private String preSettlementAuditTime;
    @ApiCloudField(value="状态名称", example="制单")
    private String preSettlementStateName;
    @ApiCloudField(value="状态代码", example="1")
    private Integer preSettlementStateCode;
    @ApiCloudField(value="预收金额（小数点2位）", example="1.0")
    private BigDecimal preSettlementPaid;
    @ApiCloudField(value="结算金额（小数点2位）", example="1.0")
    private BigDecimal preSettlementMoney;
    @ApiCloudField(value="关联门店预收单号", example="YS4344010000010")
    private String relationPreSettlementNo;
    @ApiCloudField(value="最后修改时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-20 00:00:00")
    private String preSettlementLastEditTime;
    @ApiCloudField(value="关联门店要货单", example="")
    private List<RequestOrderVOModel> requestOrders;
    @ApiCloudField(value="现金银行编号", example="950000179")
    private Integer accountBankNum;
    @ApiCloudField(value="外部单号", example="YS4344990002262")
    private String preSettlementRefBillNo;
}
