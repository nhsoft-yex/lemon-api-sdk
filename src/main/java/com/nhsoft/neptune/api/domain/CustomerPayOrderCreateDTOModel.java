package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayOrderCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayOrderCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="phone", required=true)
    private String phone;
    @ApiCloudField(value="购卡类别(MONTH:月卡,QUARTER:季卡,SEMI_ANNUAL:半年卡,ANNUAL:年卡,EXPERIENCE:体验卡,CUSTOM:自定义卡)", example="MONTH", required=true)
    private String kind;
    @ApiCloudField(value="level_id", required=true)
    private Long levelId;
    @ApiCloudField(value="bill_no")
    private String billNo;
    @ApiCloudField(value="received_amount", required=true)
    private BigDecimal receivedAmount;
    @ApiCloudField(value="transaction_no")
    private String transactionNo;
    @ApiCloudField(value="openid")
    private String openid;
    @ApiCloudField(value="payment_type")
    private String paymentType;
    @ApiCloudField(value="operator")
    private String operator;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="account_branch_num")
    private Integer accountBranchNum;
    @ApiCloudField(value="会员来源(WECHAT_OFFICIAL|WECHAT_MP|WECHAT_PAY|ALIPAY_PAY|MANUAL|OFFLINE|WECOM|OMS|ALI_MP|TIK_TOK|H5)", example="WECHAT_OFFICIAL", required=true)
    private String source;
    @ApiCloudField(value="支付方法(EMPTY|FREE|GIVEN|ALLPAY|WECHAT)", example="EMPTY", required=true)
    private String payMethod;
}
