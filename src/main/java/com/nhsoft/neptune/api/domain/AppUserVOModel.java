package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserVOModel extends ApiCloudObject {

    @ApiCloudField(value="前台用户编码", example="207200382")
    private Integer appUserNum;
    @ApiCloudField(value="所属门店", example="1111")
    private Integer branchNum;
    @ApiCloudField(value="角色编码", example="1111")
    private Integer systemRoleNum;
    @ApiCloudField(value="用户名", example="admin")
    private String appUserCode;
    @ApiCloudField(value="显示名称", example="管理员")
    private String appUserName;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean appUserEnable;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean appUserDelTag;
    @ApiCloudField(value="门店分组编码", example="")
    private List<Long> branchGroupNums;
    @ApiCloudField(value="允许登录触摸屏销售终端", example="true")
    private Boolean touchPosUser;
    @ApiCloudField(value="最大经理折扣金额(0表示不限制)")
    private BigDecimal userMaxDiscount;
    @ApiCloudField(value="最大经理折扣率(0表示不限制)")
    private BigDecimal userMaxDiscountRate;
    @ApiCloudField(value="照片", example="")
    private String pictureUrl;
    @ApiCloudField(value="最大挂单数")
    private Integer userMaxOrderNumber;
    @ApiCloudField(value="最大手改折扣率")
    private BigDecimal appUserMaxHandDiscount;
    @ApiCloudField(value="授权卡号", example="")
    private String appUserAuthorizeCard;
    @ApiCloudField(value="终端类型", example="")
    private List<String> appUserPosTypes;
    @ApiCloudField(value="前台密码", example="")
    private String appUserPassword;
}
