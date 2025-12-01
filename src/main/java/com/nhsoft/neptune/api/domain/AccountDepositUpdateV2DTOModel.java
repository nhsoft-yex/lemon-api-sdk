package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountDepositUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDepositUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="150200002", required=true)
    private String accountDepositFid;
    @ApiCloudField(value="付款门店编码", example="1", required=true)
    private Integer innerBranchNum;
    @ApiCloudField(value="支付方式", example="支付宝", required=true)
    private String accountDepositPaymentType;
    @ApiCloudField(value="收款人", example="管理员", required=true)
    private String accountDepositPaymentMan;
    @ApiCloudField(value="参考单据号", example="150200002")
    private String accountDepositBillref;
    @ApiCloudField(value="收款日期(yyyy-MM-dd)", example="2021-04-20", required=true)
    private String accountDepositDate;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String accountDepositOperator;
    @ApiCloudField(value="备注", example="备注1")
    private String accountDepositMemo;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.1", required=true)
    private BigDecimal accountDepositMoney;
    @ApiCloudField(value="收款账户", example="1232322421", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="充值明细", example="", required=true)
    private List<AccountDepositDetailSaveV2DTOModel> details;
}
