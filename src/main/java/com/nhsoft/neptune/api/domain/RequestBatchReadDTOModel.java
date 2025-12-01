package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板编号", example="434400001", required=true)
    private Long id;
}
