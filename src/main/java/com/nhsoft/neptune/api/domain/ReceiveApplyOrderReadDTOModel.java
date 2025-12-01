package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveApplyOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveApplyOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="收款冻结单ID", example="RF0000120211026000003", required=true)
    private String id;
}
