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

    @ApiCloudField(value="购买记录id", example="1", required=true)
    private Long id;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
