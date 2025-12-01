package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ApplyItemFailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplyItemFailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请流水", example="4344990000226", required=true)
    private String applyPositemFid;
    @ApiCloudField(value="审核人", example="管理员", required=true)
    private String applyPositemOperator;
}
