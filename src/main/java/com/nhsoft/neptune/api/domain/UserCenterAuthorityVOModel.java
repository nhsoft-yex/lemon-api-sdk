package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterAuthorityVO模型
 * 用户中心权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterAuthorityVOModel extends ApiCloudObject {

    @ApiCloudField(value="权限ID", example="9212089")
    private Long id;
    @ApiCloudField(value="应用类型", example="WECOM")
    private String appType;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="模块")
    private String module;
    @ApiCloudField(value="名称", example="商城-总部管理-总库存管理-新增")
    private String name;
    @ApiCloudField(value="路径", example="/商城管理/总部管理/总库存管理/新增")
    private String path;
    @ApiCloudField(value="序号", example="3_3_1_1")
    private String serialNum;
}
