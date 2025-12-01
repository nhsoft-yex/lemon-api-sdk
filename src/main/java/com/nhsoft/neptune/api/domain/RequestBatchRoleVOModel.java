package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchRoleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchRoleVOModel extends ApiCloudObject {

    @ApiCloudField(value="角色id", example="1")
    private Long roleId;
    @ApiCloudField(value="角色名称", example="管理员")
    private String roleName;
}
