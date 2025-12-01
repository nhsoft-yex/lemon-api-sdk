package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="加工单编号", example="JO2072990001006", required=true)
    private String processingOrderFid;
}
