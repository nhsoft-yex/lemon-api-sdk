package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterSimpleRoleDTO模型
 * 用户中心角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterSimpleRoleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="company_id")
    private String companyId;
    @ApiCloudField(value="角色id", example="1")
    private Integer id;
    @ApiCloudField(value="角色名称", example="系统管理员")
    private String name;
    @ApiCloudField(value="描述", example="系统管理员")
    private String description;
}
