package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchLabelV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchLabelV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="标签ID", example="434401000011")
    private Long labelId;
    @ApiCloudField(value="标签名称", example="标签A")
    private String labelName;
    @ApiCloudField(value="标签类型", example="BRANCH")
    private String labelType;
}
