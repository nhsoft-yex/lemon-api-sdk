package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentReasonV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentReasonV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调整原因", example="手工录入")
    private String adjustmentOrderCause;
    @ApiCloudField(value="调整方式", example="入库")
    private String adjustmentOrderDirection;
    @ApiCloudField(value="调整原因代码", example="10001")
    private String adjustmentOrderCauseCode;
}
