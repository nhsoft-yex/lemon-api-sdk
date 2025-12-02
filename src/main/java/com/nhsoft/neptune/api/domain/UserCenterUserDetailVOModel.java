package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterUserDetailVO模型
 * 用户中心用户详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterUserDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="公司用户id", example="267636")
    private Long id;
    @ApiCloudField(value="公司ID", example="2072")
    private Integer companyId;
    @ApiCloudField(value="用户编号", example="1")
    private Integer userId;
    @ApiCloudField(value="角色", example="ADMIN")
    private String type;
    @ApiCloudField(value="所属门店id", example="1")
    private Integer branchId;
    @ApiCloudField(value="管理门店范围门店分组下门店编号列表", example="[1]")
    private List<Long> branchIds;
    @ApiCloudField(value="管理门店范围门店列表", example="[1]")
    private List<Long> extraBranchIds;
    @ApiCloudField(value="用户名称", example="qqq")
    private String name;
    @ApiCloudField(value="用户手机号", example="17894444110")
    private String phone;
    @ApiCloudField(value="角色类型", example="")
    private List<UserCenterSimpleRoleDTOModel> simpleRoles;
    @ApiCloudField(value="权限信息", example="")
    private List<String> authorities;
    @ApiCloudField(value="管理仓库列表", example="[996755017]")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="管理部门列表", example="[部门1]")
    private List<String> departments;
}
