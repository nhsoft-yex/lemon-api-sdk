package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementBalanceReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementBalanceReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="资金账户ID", example="G00001004722", required=true)
    private String id;
}
