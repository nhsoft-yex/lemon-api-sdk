package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户编码", example="2561")
    private Integer appUserNum;
    @ApiCloudField(value="用户中心id", example="133411")
    private Long companyUserId;
}
