package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户编码", example="1", required=true)
    private Integer appUserNum;
    @ApiCloudField(value="授权卡号", example="0001")
    private String appUserAuthorizeCard;
    @ApiCloudField(value="显示名", example="admin")
    private String appUserCode;
    @ApiCloudField(value="用户名", example="管理员")
    private String appUserName;
    @ApiCloudField(value="用户密码", example="123456")
    private String appUserPassword;
    @ApiCloudField(value="用户电话", example="17644219971")
    private String appUserPhone;
    @ApiCloudField(value="用户邮箱", example="yexin@163.com")
    private String appUserEmail;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="角色编码", example="1")
    private Integer systemRoleNum;
    @ApiCloudField(value="门店分组编码", example="434401000059,434401000003")
    private List<String> branchGroupingNums;
    @ApiCloudField(value="所属部门", example="01,02")
    private List<String> appUserDepartmentCodes;
    @ApiCloudField(value="所属仓库", example="202700001,202700002")
    private List<Integer> appUserStoreHouseNums;
    @ApiCloudField(value="限制查询时间类型（天数|月数|年数需传计数、自定义时间需传开始时间）", example="天数")
    private String limitTimeType;
    @ApiCloudField(value="限制查询时间计数", example="1")
    private Integer limitTimeCount;
    @ApiCloudField(value="限制查询开始时间", example="2025-01-01")
    private String limitTimeDay;
    @ApiCloudField(value="允许登录触摸屏销售终端", example="true")
    private Boolean touchPosUser;
}
