package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserResponse模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserResponseModel extends ApiCloudObject {

    @ApiCloudField(value="code")
    private Integer code;
    @ApiCloudField(value="msg")
    private String msg;
    @ApiCloudField(value="user")
    private UserModel user;
}
