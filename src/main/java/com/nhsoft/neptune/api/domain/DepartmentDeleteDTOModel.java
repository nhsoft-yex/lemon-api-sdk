package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DepartmentDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DepartmentDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="部门代码列表", example="001", required=true)
    private List<String> departmentCodes;
}
