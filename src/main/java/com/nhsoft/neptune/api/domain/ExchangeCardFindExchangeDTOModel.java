package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardFindExchangeDTO模型
 * 次卡兑换查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardFindExchangeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费开始时间", required=true)
    private String exchangeTimeFrom;
    @ApiCloudField(value="消费结束时间", required=true)
    private String exchangeTimeTo;
    @ApiCloudField(value="用户中心门店编码列表", example="[1]")
    private List<Integer> branchIds;
    @ApiCloudField(value="次卡卡号", example="400000000062")
    private String cardPrintedNum;
    @ApiCloudField(value="关联订单号", example="1234200")
    private String relationOrderNo;
    @ApiCloudField(value="操作渠道(线上-ONLINE;线下-OFFLINE)", example="ONLINE")
    private String operateSource;
}
