package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutBranchRelateReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutBranchRelateReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="第三方门店渠道(抖音|美团|口碑|快手|支付宝)", example="抖音", required=true)
    private String outBranchType;
}
