package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderCheckV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderCheckV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004311", required=true)
    private String requestOrderFid;
}
