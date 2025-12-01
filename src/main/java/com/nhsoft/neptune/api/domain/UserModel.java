package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * User模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserModel extends ApiCloudObject {

    @ApiCloudField(value="username")
    private String username;
    @ApiCloudField(value="password")
    private String password;
    @ApiCloudField(value="labels")
    private Object labels;
    @ApiCloudField(value="merchant_id")
    private String merchantId;
}
