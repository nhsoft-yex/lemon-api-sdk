package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyCancelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyCancelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String policyOperator;
}
