package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="角色编号", example="103790001", required=true)
    private Integer systemRoleNum;
    @ApiCloudField(value="角色名称", example="")
    private String systemRoleName;
    @ApiCloudField(value="角色类别", example="")
    private String systemRoleCategory;
    @ApiCloudField(value="是否显示 对应页面上 只允许有角色管理权限的用户使用", example="false")
    private Boolean systemRoleShowFlag;
    @ApiCloudField(value="角色权限关联关系", example="")
    private List<SystemRolePrivilegeDTOModel> rolePrivilegeNews;
}
