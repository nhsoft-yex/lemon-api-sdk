package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerSourceDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSourceDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="全渠道会员Id", example="2095001", required=true)
    private String customerId;
    @ApiCloudField(value="三方渠道会员标识", example="2088000211", required=true)
    private String openid;
}
