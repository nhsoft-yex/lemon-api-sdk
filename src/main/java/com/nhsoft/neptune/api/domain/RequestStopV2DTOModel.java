package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestStopV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestStopV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单单据号", example="YH4344010004748", required=true)
    private String requestOrderFid;
}
