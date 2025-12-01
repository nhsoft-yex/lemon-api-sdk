package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingInOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingInOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="入库单编号", example="JO2072990001006", required=true)
    private String processingInOrderFid;
}
