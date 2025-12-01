package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountDepositV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDepositV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="150200002")
    private String accountDepositFid;
    @ApiCloudField(value="付款门店编码", example="1")
    private Integer innerBranchNum;
    @ApiCloudField(value="支付方式", example="支付宝")
    private String accountDepositPaymentType;
    @ApiCloudField(value="收款人", example="管理员")
    private String accountDepositPaymentMan;
    @ApiCloudField(value="参考单据号", example="150200002")
    private String accountDepositBillref;
    @ApiCloudField(value="收款日期(yyyy-MM-dd)", example="2021-04-20")
    private String accountDepositDate;
    @ApiCloudField(value="创建人", example="管理员")
    private String accountDepositCreator;
    @ApiCloudField(value="备注", example="备注1")
    private String accountDepositMemo;
    @ApiCloudField(value="创建时间(yyyy-MM-dd HH:mm:ss)", example="2021-04-20 00:00:00")
    private String accountDepositCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String accountDepositAuditor;
    @ApiCloudField(value="审核时间(yyyy-MM-dd HH:mm:ss)", example="2021-04-20 00:00:00")
    private String accountDepositAuditTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer accountDepositStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String accountDepositStateName;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.1")
    private BigDecimal accountDepositMoney;
    @ApiCloudField(value="收款账户", example="1232322421")
    private Integer accountBankNum;
    @ApiCloudField(value="充值明细", example="")
    private List<AccountDepositDetailV2DTOModel> details;
}
