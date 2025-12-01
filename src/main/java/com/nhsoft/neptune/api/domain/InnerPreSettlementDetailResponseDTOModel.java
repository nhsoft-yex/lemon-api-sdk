package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerPreSettlementDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerPreSettlementDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店结算单号", example="ZP4344990002262")
    private String innerSettlementNo;
    @ApiCloudField(value="预收单据号", example="YS4344990000015")
    private String preSettlementNo;
    @ApiCloudField(value="本次结算金额（小数点2位）", example="100.0")
    private BigDecimal preSettlementDetailMoney;
}
