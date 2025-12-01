package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSettlementReadRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSettlementReadRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店结算单号", example="ZP4344990002262", required=true)
    private String innerSettlementNo;
}
