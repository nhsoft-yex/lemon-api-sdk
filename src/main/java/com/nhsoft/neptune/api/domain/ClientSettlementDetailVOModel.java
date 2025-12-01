package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientSettlementDetailVO模型
 * 客户结算明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientSettlementDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户结算单号", example="RP4344990002262")
    private String clientSettlementNo;
    @ApiCloudField(value="明细编号", example="1")
    private Integer clientSettlementDetailNum;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0")
    private BigDecimal clientSettlementDetailMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="5.0")
    private BigDecimal clientSettlementDetailDiscount;
    @ApiCloudField(value="结算备注", example="备注")
    private String clientSettlementDetailMemo;
    @ApiCloudField(value="wholesale_order")
    private WholesaleOrderVOModel wholesaleOrder;
    @ApiCloudField(value="wholesale_return")
    private WholesaleReturnVOModel wholesaleReturn;
    @ApiCloudField(value="other_inout")
    private ClientOtherInoutVOModel otherInout;
}
