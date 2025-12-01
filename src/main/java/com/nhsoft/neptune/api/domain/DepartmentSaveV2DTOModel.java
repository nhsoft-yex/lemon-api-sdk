package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DepartmentSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DepartmentSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="部门代码", example="001")
    private String departmentCode;
    @ApiCloudField(value="部门名称", example="食品部")
    private String departmentName;
    @ApiCloudField(value="是否启用（1，启用,0，不启用）", example="1")
    private Integer departmentActived;
}
