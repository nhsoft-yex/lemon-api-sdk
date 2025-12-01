package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerRejectV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerRejectV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="NS4344090000063", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String innerOrderOperator;
}
