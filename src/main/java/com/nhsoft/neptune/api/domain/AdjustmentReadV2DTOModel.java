package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="库存调整单号", example="OO2113990000009", required=true)
    private String adjustmentOrderFid;
}
