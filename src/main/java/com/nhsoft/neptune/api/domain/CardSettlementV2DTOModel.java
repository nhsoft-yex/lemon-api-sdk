package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardSettlementV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardSettlementV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="单号", example="")
    private String orderFid;
    @ApiCloudField(value="单据类型", example="")
    private String orderType;
    @ApiCloudField(value="单据状态代码（1：制单3：制单|审核）")
    private Integer stateCode;
    @ApiCloudField(value="制单时间（yyyy-mm-dd HH:MM:SS）", example="")
    private String createTime;
    @ApiCloudField(value="制单人", example="")
    private String creator;
    @ApiCloudField(value="修改时间", example="")
    private String editTime;
    @ApiCloudField(value="修改人", example="")
    private String editor;
    @ApiCloudField(value="审核时间（yyyy-mm-dd HH:MM:SS）", example="")
    private String auditTime;
    @ApiCloudField(value="审核人", example="")
    private String auditor;
    @ApiCloudField(value="制单门店编号")
    private Integer branchNum;
    @ApiCloudField(value="制单门店名称", example="")
    private String branchName;
    @ApiCloudField(value="结算门店编号")
    private Integer toBranchNum;
    @ApiCloudField(value="结算门店名称", example="")
    private String toBranchName;
    @ApiCloudField(value="上次结算日期", example="")
    private String cardSettlementLastPaymentDate;
    @ApiCloudField(value="最后修改时间", example="")
    private String cardSettlementLastEditTime;
    @ApiCloudField(value="结算截止日期", example="")
    private String cardSettlementDate;
    @ApiCloudField(value="付款方式", example="")
    private String cardSettlementPaymentType;
    @ApiCloudField(value="结算状态 （未结算 部分结算 全部结算）", example="")
    private String cardSettlementType;
    @ApiCloudField(value="备注", example="")
    private String memo;
    @ApiCloudField(value="存款明细", example="")
    private List<CardDepositV2DTOModel> cardDepositDetails;
    @ApiCloudField(value="消费明细", example="")
    private List<CardConsumeResponseDTOModel> cardConsumeDetails;
    @ApiCloudField(value="补扣明细", example="")
    private List<CardConsumeResponseDTOModel> recardDetails;
    @ApiCloudField(value="存款现金", example="1800.0")
    private BigDecimal cardSettlementDepositCash;
    @ApiCloudField(value="存款金额", example="2000.0")
    private BigDecimal cardSettlementDepositMoney;
    @ApiCloudField(value="消费金额", example="757.3")
    private BigDecimal cardSettlementConsumeMoney;
    @ApiCloudField(value="补扣总额", example="0.0")
    private BigDecimal cardSettlementReConsumeMoney;
    @ApiCloudField(value="未扣总额", example="0.0")
    private BigDecimal cardSettlementUnConsumeMoney;
    @ApiCloudField(value="付款金额", example="1255.48")
    private BigDecimal cardSettlementPaidMoney;
    @ApiCloudField(value="折扣金额", example="15.2")
    private BigDecimal cardSettlementDiscountMoney;
    @ApiCloudField(value="结算金额", example="15.2")
    private BigDecimal cardSettlementMoney;
}
