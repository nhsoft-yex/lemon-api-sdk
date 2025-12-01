package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentReasonSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentReasonSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调整原因代码", example="10001", required=true)
    private String adjustmentOrderCauseCode;
    @ApiCloudField(value="调整原因名称", example="手工录入", required=true)
    private String adjustmentOrderCause;
    @ApiCloudField(value="调整方式(出库、入库)", example="入库", required=true)
    private String adjustmentOrderDirection;
    @ApiCloudField(value="调整原因类型(调整、报损)", example="调整", required=true)
    private String adjustmentOrderCauseType;
}
