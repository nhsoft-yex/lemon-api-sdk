package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicRoleVO模型
 * 用户角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicRoleVOModel extends ApiCloudObject {

    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="角色ID", example="1")
    private Integer id;
    @ApiCloudField(value="角色名称", example="管理员")
    private String name;
}
