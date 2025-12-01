package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="内部申请单编号", example="NS4344010000304", required=true)
    private String innerOrderFid;
}
