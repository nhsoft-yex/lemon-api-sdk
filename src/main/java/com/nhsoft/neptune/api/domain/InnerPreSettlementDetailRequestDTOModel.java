package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerPreSettlementDetailRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerPreSettlementDetailRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="预收单据号", example="YS4344990000015", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal preSettlementDetailMoney;
}
