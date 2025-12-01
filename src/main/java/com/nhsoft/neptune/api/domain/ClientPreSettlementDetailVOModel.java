package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientPreSettlementDetailVO模型
 * 客户预收明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientPreSettlementDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户结算单号", example="RP4344990002262")
    private String clientSettlementNo;
    @ApiCloudField(value="预收单据号", example="YC4344990000015")
    private String preSettlementNo;
    @ApiCloudField(value="本次结算金额（小数点2位）", example="100.0")
    private BigDecimal preSettlementDetailMoney;
}
