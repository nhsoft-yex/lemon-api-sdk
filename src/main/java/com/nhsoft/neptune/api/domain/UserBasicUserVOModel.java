package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicUserVO模型
 * 用户中心用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicUserVOModel extends ApiCloudObject {

    @ApiCloudField(value="用户ID", example="1")
    private Integer userId;
    @ApiCloudField(value="公司用户ID", example="1")
    private Integer companyUserId;
    @ApiCloudField(value="公司用户代码")
    private Integer companyUserCode;
    @ApiCloudField(value="用户类型（OWNER|ADMIN|NORMAL|PARTNER|OPEN", example="OWNER")
    private String type;
    @ApiCloudField(value="门店ID", example="1")
    private Integer branchId;
    @ApiCloudField(value="管理门店ID列表", example="[1]")
    private List<Integer> branchGroupIds;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="昵称", example="dyf")
    private String name;
    @ApiCloudField(value="手机号码", example="18667885599")
    private String phone;
    @ApiCloudField(value="用户角色")
    private List<UserBasicRoleVOModel> simpleRoles;
    @ApiCloudField(value="管理门店列表（门店id列表）", example="[1]")
    private List<Integer> extraBranchIds;
    @ApiCloudField(value="管理仓库列表", example="[996755017]")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="管理部门列表", example="[部门1]")
    private List<String> departments;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
}
