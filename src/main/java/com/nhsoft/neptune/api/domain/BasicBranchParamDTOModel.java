package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicBranchParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicBranchParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="门店参数字段", example="ENABLE_USER_CENTER_V2")
    private String branchParamKey;
    @ApiCloudField(value="门店参数值", example="true")
    private String branchParamValue;
}
