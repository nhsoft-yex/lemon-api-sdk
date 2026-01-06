package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayOrderCancelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayOrderCancelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="id", required=true)
    private Long id;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
