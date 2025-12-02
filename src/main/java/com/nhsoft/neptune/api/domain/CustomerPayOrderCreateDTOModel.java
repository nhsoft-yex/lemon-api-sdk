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

    @ApiCloudField(value="手机号", example="17644219987", required=true)
    private String phone;
    @ApiCloudField(value="购卡类别(MONTH:月卡,QUARTER:季卡,SEMI_ANNUAL:半年卡,ANNUAL:年卡,EXPERIENCE:体验卡,CUSTOM:自定义卡)", example="MONTH", required=true)
    private String kind;
    @ApiCloudField(value="等级Id", example="1", required=true)
    private Long levelId;
    @ApiCloudField(value="单据号", example="RF4220000011")
    private String billNo;
    @ApiCloudField(value="实收金额,元", example="100.0", required=true)
    private BigDecimal receivedAmount;
    @ApiCloudField(value="支付流水号", example="123456789")
    private String transactionNo;
    @ApiCloudField(value="微信openid", example="123456789")
    private String openid;
    @ApiCloudField(value="支付方式", example="现金")
    private String paymentType;
    @ApiCloudField(value="推广人", example="张三")
    private String operator;
    @ApiCloudField(value="门店编号", example="10001", required=true)
    private Integer branchNum;
    @ApiCloudField(value="到账门店编号", example="10001")
    private Integer accountBranchNum;
    @ApiCloudField(value="会员来源(WECHAT_OFFICIAL|WECHAT_MP|WECHAT_PAY|ALIPAY_PAY|MANUAL|OFFLINE|WECOM|OMS|ALI_MP|TIK_TOK|H5)", example="WECHAT_OFFICIAL", required=true)
    private String source;
    @ApiCloudField(value="支付方法(EMPTY|FREE|GIVEN|ALLPAY|WECHAT)", example="EMPTY", required=true)
    private String payMethod;
}
