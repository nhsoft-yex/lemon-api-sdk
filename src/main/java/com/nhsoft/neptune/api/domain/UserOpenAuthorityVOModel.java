package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserOpenAuthorityVO模型
 * 开放应用权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserOpenAuthorityVOModel extends ApiCloudObject {

    @ApiCloudField(value="权限ID", example="9212089")
    private Long id;
    @ApiCloudField(value="开放应用ID", example="376d585f437e4696b32144b81ae83b99")
    private String openAppId;
    @ApiCloudField(value="开放应用权限名称", example="查询")
    private String name;
    @ApiCloudField(value="开放应用权限路径", example="/报表/查询")
    private String path;
    @ApiCloudField(value="序号", example="1_1_2")
    private String serialNum;
}
