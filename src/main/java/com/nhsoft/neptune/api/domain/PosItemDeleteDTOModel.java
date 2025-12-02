package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="[102200551]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
