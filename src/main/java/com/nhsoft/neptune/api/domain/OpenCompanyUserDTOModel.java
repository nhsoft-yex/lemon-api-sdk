package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OpenCompanyUserDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OpenCompanyUserDTOModel extends ApiCloudObject {

    @ApiCloudField(value="type", required=true)
    private String type;
    @ApiCloudField(value="token", required=true)
    private String token;
}
