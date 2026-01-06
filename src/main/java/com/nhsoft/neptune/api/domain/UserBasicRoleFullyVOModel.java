package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicRoleFullyVO模型
 * 用户角色O
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicRoleFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="角色ID", example="1")
    private Integer id;
    @ApiCloudField(value="角色名称", example="管理员")
    private String name;
    @ApiCloudField(value="权限信息")
    private List<UserCenterAuthorityVOModel> authorities;
    @ApiCloudField(value="开放应用权限信息")
    private List<UserOpenAuthorityVOModel> openAuthorities;
    @ApiCloudField(value="合作伙伴类型(SUPPLIER|WHOLESALER|DISTRIBUTOR)", example="SUPPLIER")
    private String partnerType;
    @ApiCloudField(value="修改时间")
    private String updatedAt;
    @ApiCloudField(value="是否只允许有角色管理权限的用户使用", example="true")
    private Boolean usedForRoleManager;
    @ApiCloudField(value="用户数")
    private Integer companyUserCount;
}
