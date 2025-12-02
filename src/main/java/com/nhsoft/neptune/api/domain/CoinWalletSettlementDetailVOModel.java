package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CoinWalletSettlementDetailVO模型
 * 零钱包结算明细VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CoinWalletSettlementDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID")
    private Long id;
    @ApiCloudField(value="结算id")
    private Long settlementId;
    @ApiCloudField(value="零钱包明细ID(扩展为明细单id)")
    private Long coinWalletDetailId;
    @ApiCloudField(value="客户ID")
    private Long customerId;
    @ApiCloudField(value="交班日期", example="")
    private String shiftTableBizday;
    @ApiCloudField(value="操作时间")
    private String createdAt;
    @ApiCloudField(value="类型(零钱包用)", example="")
    private String type;
    @ApiCloudField(value="存扣金额(扩展为明细单金额)")
    private BigDecimal money;
    @ApiCloudField(value="关联单号", example="")
    private String billNum;
    @ApiCloudField(value="结算金额")
    private BigDecimal settlementMoney;
    @ApiCloudField(value="卡号(若是券结算，则存券号)", example="")
    private String cardPrintedNum;
    @ApiCloudField(value="卡类型名称(若是券结算，则存券类型名称)", example="")
    private String cardTypeName;
    @ApiCloudField(value="次卡结算的结算类型", example="")
    private String exchangeCardSettlementScope;
    @ApiCloudField(value="门店名称(次卡购买记录时指购买门店，消费记录时指消费门店，退款记录时指退款门店)", example="")
    private String branchName;
}
