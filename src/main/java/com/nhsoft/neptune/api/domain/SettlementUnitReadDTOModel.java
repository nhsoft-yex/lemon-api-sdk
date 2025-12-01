package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementUnitReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementUnitReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="往来单位ID", example="R00001000909", required=true)
    private String id;
}
