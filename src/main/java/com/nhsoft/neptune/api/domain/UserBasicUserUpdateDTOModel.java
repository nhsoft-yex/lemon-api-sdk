package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicUserUpdateDTO模型
 * 用户中心用户更新DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicUserUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户ID", example="1", required=true)
    private Integer companyUserId;
    @ApiCloudField(value="昵称", example="杜一凡", required=true)
    private String name;
    @ApiCloudField(value="手机号码", example="18667885599", required=true)
    private String phone;
    @ApiCloudField(value="门店ID", example="1", required=true)
    private Integer branchId;
    @ApiCloudField(value="角色ID列表", example="[1]", required=true)
    private List<Integer> roles;
    @ApiCloudField(value="用户类型（ADMIN|NORMAL|PARTNER）", example="NORMAL", required=true)
    private String type;
    @ApiCloudField(value="应用类型列表", example="[AMA]", required=true)
    private List<String> appTypes;
    @ApiCloudField(value="开放应用ID列表", example="[ba2ac5d7ebd64cbf9f109ae0801b1464]")
    private List<String> openAppIds;
    @ApiCloudField(value="管理门店列表（门店分组）", example="[1]")
    private List<Integer> branchGroupIds;
    @ApiCloudField(value="是否启用", example="true", required=true)
    private Boolean enable;
    @ApiCloudField(value="管理门店列表（门店id列表）", example="[1]")
    private List<Integer> extraBranchIds;
}
