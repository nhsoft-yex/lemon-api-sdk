package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPhoneUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPhoneUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="手机号", example="17644219971", required=true)
    private String phone;
    @ApiCloudField(value="会员ID", example="207200025932", required=true)
    private String customerId;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
}
