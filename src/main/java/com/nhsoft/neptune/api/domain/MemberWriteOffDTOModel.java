package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberWriteOffDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberWriteOffDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="手机号", example="15807895635", required=true)
    private String phone;
}
