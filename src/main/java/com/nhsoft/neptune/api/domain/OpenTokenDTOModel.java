package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OpenTokenDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OpenTokenDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心跳转token", example="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.", required=true)
    private String token;
}
