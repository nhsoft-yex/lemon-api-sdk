package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="角色类别", example="WEB用户角色", required=true)
    private String systemRoleCategory;
}
