package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientPreSettlementReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientPreSettlementReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户预收单号", example="YC4344990002262", required=true)
    private String preSettlementNo;
}
