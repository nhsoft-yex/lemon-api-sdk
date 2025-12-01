package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="角色名称", example="管理员", required=true)
    private String systemRoleName;
    @ApiCloudField(value="角色类别", example="WEB用户角色")
    private String systemRoleCategory;
    @ApiCloudField(value="只允许有角色管理权限的用户使用", example="false")
    private Boolean systemRoleShowFlag;
    @ApiCloudField(value="角色权限关联关系", example="", required=true)
    private List<SystemRolePrivilegeDTOModel> rolePrivilegeNews;
}
