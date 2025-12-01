package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientPreSettlementVO模型
 * 客户预收结算VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientPreSettlementVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户预收单号", example="YC4344010000010")
    private String preSettlementNo;
    @ApiCloudField(value="客户编号", example="434400001")
    private String clientFid;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="地址", example="宁波")
    private String preSettlementAddress;
    @ApiCloudField(value="开户银行", example="宁波银行")
    private String preSettlementBank;
    @ApiCloudField(value="银行账号", example="123")
    private String preSettlementBankAccount;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd", example="Wed Jan 20 08:00:00 CST 2021")
    private String preSettlementDate;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd HH:mm:ss")
    private String preSettlementTime;
    @ApiCloudField(value="付款方式", example="现金")
    private String preSettlementPaymentType;
    @ApiCloudField(value="备注", example="备注")
    private String preSettlementMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String preSettlementCreator;
    @ApiCloudField(value="创建时间 格式：yyyy-MM-dd HH:mm:ss")
    private String preSettlementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String preSettlementAuditor;
    @ApiCloudField(value="审核时间 格式：yyyy-MM-dd HH:mm:ss")
    private String preSettlementAuditTime;
    @ApiCloudField(value="状态名称", example="制单")
    private String preSettlementStateName;
    @ApiCloudField(value="状态代码", example="1")
    private Integer preSettlementStateCode;
    @ApiCloudField(value="预收金额（小数点2位）", example="1.0")
    private BigDecimal preSettlementPaid;
    @ApiCloudField(value="结算金额（小数点2位）", example="1.0")
    private BigDecimal preSettlementMoney;
    @ApiCloudField(value="关联客户预收单号", example="YC4344010000010")
    private String relationPreSettlementNo;
    @ApiCloudField(value="最后修改时间 格式：yyyy-MM-dd HH:mm:ss")
    private String preSettlementLastEditTime;
    @ApiCloudField(value="关联批发订单")
    private List<WholesaleBookVOModel> wholesaleBooks;
    @ApiCloudField(value="现金银行编号", example="950000179")
    private Integer accountBankNum;
}
