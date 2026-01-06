package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderBatchDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderBatchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号列表", example="[YH996750000001]", required=true)
    private List<String> requestOrderFids;
    @ApiCloudField(value="操作员", example="admin", required=true)
    private String operator;
}
