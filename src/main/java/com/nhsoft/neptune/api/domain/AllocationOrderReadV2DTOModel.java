package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="转仓单号", example="ZH2030990000002", required=true)
    private String allocationOrderFid;
}
