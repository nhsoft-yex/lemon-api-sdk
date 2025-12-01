package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutBranchRelateVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutBranchRelateVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="第三方门店渠道(抖音|美团|口碑|快手|支付宝)", example="抖音")
    private String outBranchType;
    @ApiCloudField(value="第三方门店编号", example="54321")
    private String outBranchId;
    @ApiCloudField(value="最后修改时间")
    private String lastEditTime;
}
