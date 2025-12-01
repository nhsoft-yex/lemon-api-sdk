package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardExchangeVO模型
 * 次卡兑换VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardExchangeVOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心门店编号", example="93756")
    private Long branchId;
    @ApiCloudField(value="门店名称", example="分店1")
    private String branchName;
    @ApiCloudField(value="次卡ID", example="10")
    private Long cardId;
    @ApiCloudField(value="次卡编号", example="400000000010")
    private String cardPrintedNum;
    @ApiCloudField(value="exchange_card_type")
    private ExchangeCardTypeVOModel exchangeCardType;
    @ApiCloudField(value="次卡消费时间")
    private String exchangeTime;
    @ApiCloudField(value="备注", example="备注")
    private String memo;
    @ApiCloudField(value="操作人", example="1")
    private String operator;
    @ApiCloudField(value="消费前剩余次数", example="1")
    private Integer previousBalanceTime;
    @ApiCloudField(value="关联单号", example="18120")
    private String relationOrderNo;
    @ApiCloudField(value="本次消费售价的分摊金额", example="2.86")
    private BigDecimal sellPriceSplitMoney;
    @ApiCloudField(value="是否结算完成", example="true")
    private Boolean settlementFlag;
    @ApiCloudField(value="营业日", example="20250407")
    private String shiftTableBizday;
    @ApiCloudField(value="操作渠道(线上-ONLINE;线下-OFFLINE)", example="ONLINE")
    private String source;
    @ApiCloudField(value="本次消费次数", example="1")
    private Integer times;
}
