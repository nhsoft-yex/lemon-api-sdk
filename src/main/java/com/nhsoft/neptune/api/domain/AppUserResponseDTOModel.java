package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户编码", example="207200382")
    private Integer appUserNum;
    @ApiCloudField(value="门店编码", example="1111")
    private Integer branchNum;
    @ApiCloudField(value="显示名", example="admin")
    private String appUserCode;
    @ApiCloudField(value="用户名", example="管理员")
    private String appUserName;
    @ApiCloudField(value="用户状态(启用|不启用)", example="启用")
    private String appUserStateName;
    @ApiCloudField(value="用户删除状态(true:删除，false:未删除)", example="false")
    private Boolean appUserDelTag;
    @ApiCloudField(value="用户电话", example="17644219971")
    private String appUserPhone;
    @ApiCloudField(value="用户邮箱", example="yexin@163.com")
    private String appUserEmail;
    @ApiCloudField(value="区域编码", example="1,12")
    private String branchRegionNum;
    @ApiCloudField(value="所属部门", example="测试部门,部门2")
    private String appUserDepartment;
    @ApiCloudField(value="用户角色信息", example="")
    private List<SystemRoleDTOModel> systemRoles;
    @ApiCloudField(value="门店信息", example="")
    private List<BranchDTOModel> branchs;
    @ApiCloudField(value="允许登录触摸屏销售终端", example="true")
    private Boolean touchPosUser;
    @ApiCloudField(value="公司用户ID")
    private Long companyUserId;
    @ApiCloudField(value="对应用户中心ID")
    private Long appUserCenterIdV2;
}
