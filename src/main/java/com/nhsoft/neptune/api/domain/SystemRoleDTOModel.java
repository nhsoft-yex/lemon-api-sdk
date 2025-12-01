package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="角色编码", example="207200001")
    private Integer systemRoleNum;
    @ApiCloudField(value="角色名称", example="管理员")
    private String systemRoleName;
    @ApiCloudField(value="角色分类", example="WEB用户角色")
    private String systemRoleCategory;
    @ApiCloudField(value="删除标志(true:删除,false:未删除)", example="false")
    private Boolean systemRoleDelTag;
    @ApiCloudField(value="用户中心角色（true:是,false:否）", example="false")
    private Boolean userCenterRole;
}
