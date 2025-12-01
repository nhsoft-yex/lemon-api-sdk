package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemRoleDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="角色编号", example="103790001", required=true)
    private Integer systemRoleNum;
}
