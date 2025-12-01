package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DepartmentV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DepartmentV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="部门代码", example="01")
    private String departmentCode;
    @ApiCloudField(value="部门名称", example="食品部")
    private String departmentName;
    @ApiCloudField(value="是否启用（1，启用）", example="1")
    private Object departmentActived;
}
