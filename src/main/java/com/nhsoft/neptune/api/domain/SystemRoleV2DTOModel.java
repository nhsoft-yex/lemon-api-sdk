package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="账套号", example="4344")
    private String systemBookCode;
    @ApiCloudField(value="角色编号", example="103790001")
    private Integer systemRoleNum;
    @ApiCloudField(value="角色名称", example="管理员")
    private String systemRoleName;
    @ApiCloudField(value="角色类别", example="WEB用户角色")
    private String systemRoleCategory;
}
