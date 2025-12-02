package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementTypeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementTypeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="类别(CASH（现金）, CHANNEL(渠道), BANK（银行）)", example="100")
    private String category;
}
