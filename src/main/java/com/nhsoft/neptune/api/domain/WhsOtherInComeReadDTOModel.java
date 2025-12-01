package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComeReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComeReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="2023010000000001", required=true)
    private String whsOtherIncomeNo;
}
