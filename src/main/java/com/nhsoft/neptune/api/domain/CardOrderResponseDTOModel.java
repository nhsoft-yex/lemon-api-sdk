package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderResponseDTO模型
 * 会员卡订单响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="BC2072010000002", required=true)
    private String cardOrderFid;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="制单人", example="system", required=true)
    private String cardOrderCreator;
    @ApiCloudField(value="创建时间", example="2022-09-03 22:00:00", required=true)
    private String cardOrderCreateTime;
    @ApiCloudField(value="审核人", example="system", required=true)
    private String cardOrderAuditor;
    @ApiCloudField(value="审核时间", example="2022-09-05 22:00:00", required=true)
    private String cardOrderAuditTime;
    @ApiCloudField(value="客户名称", example="零食很忙", required=true)
    private String cardOrderCustName;
    @ApiCloudField(value="联系电话", example="15804278917")
    private String cardOrderCustPhone;
    @ApiCloudField(value="付款金额", example="10.0", required=true)
    private BigDecimal cardOrderDepositCash;
    @ApiCloudField(value="发卡金额", example="10.0", required=true)
    private BigDecimal cardOrderDepositMoney;
    @ApiCloudField(value="发卡数量", example="1", required=true)
    private Integer cardOrderCardAmount;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String cardOrderPaymentType;
    @ApiCloudField(value="卡类型名称", example="电子卡", required=true)
    private String cardUserTypeName;
    @ApiCloudField(value="密码规则(随机密码，固定密码、表面卡号)", example="随机密码", required=true)
    private String cardOrderPasswordType;
    @ApiCloudField(value="密码", example="10.00", required=true)
    private String cardOrderPassword;
    @ApiCloudField(value="团购类型", example="团购制卡", required=true)
    private String cardOrderType;
    @ApiCloudField(value="备注", example="备注", required=true)
    private String cardOrderMemo;
    @ApiCloudField(value="单据状态", example="制单", required=true)
    private String cardOrderState;
    @ApiCloudField(value="卡明细", example="")
    private List<CardOrderSaveDetailResponseDTOModel> cardOrderDetails;
}
