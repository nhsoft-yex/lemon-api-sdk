package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户编码", example="2561", required=true)
    private Integer appUserNum;
}
