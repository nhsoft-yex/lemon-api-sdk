package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerPreSettlementReadRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerPreSettlementReadRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店预收单号", example="YS4344990002262")
    private String preSettlementNo;
    @ApiCloudField(value="外部单号", example="YS4344990002262")
    private String preSettlementRefBillNo;
}
