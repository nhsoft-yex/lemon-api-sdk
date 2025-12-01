package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderSaveDTO模型
 * 会员卡订单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号(修改时必填)", example="BC2072010000002")
    private String cardOrderFid;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="制单人", example="system", required=true)
    private String cardOrderCreator;
    @ApiCloudField(value="客户名称", example="零食很忙", required=true)
    private String cardOrderCustName;
    @ApiCloudField(value="联系电话", example="15804278917")
    private String cardOrderCustPhone;
    @ApiCloudField(value="实际付款金额", example="10.0", required=true)
    private BigDecimal cardOrderDepositCash;
    @ApiCloudField(value="付款金额", example="10.0", required=true)
    private BigDecimal cardOrderDepositMoney;
    @ApiCloudField(value="发卡数量", example="1", required=true)
    private Integer cardOrderCardAmount;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String cardOrderPaymentType;
    @ApiCloudField(value="卡类型名称", example="电子卡", required=true)
    private String cardUserTypeName;
    @ApiCloudField(value="密码规则(随机密码，固定密码、表面卡号)", example="随机密码")
    private String cardOrderPasswordType;
    @ApiCloudField(value="密码", example="123456")
    private String cardOrderPassword;
    @ApiCloudField(value="团购类型(团购制卡|团购储值|初始化预储值)", example="团购制卡", required=true)
    private String cardOrderType;
    @ApiCloudField(value="备注", example="备注")
    private String cardOrderMemo;
    @ApiCloudField(value="卡明细", required=true)
    private List<CardOrderSaveDetailDTOModel> cardOrderDetails;
}
