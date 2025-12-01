package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicBranchParamReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicBranchParamReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="账套号", example="4344", required=true)
    private String systemBookCode;
    @ApiCloudField(value="门店参数字段", example="ENABLE_USER_CENTER_V2", required=true)
    private String branchParamKey;
}
