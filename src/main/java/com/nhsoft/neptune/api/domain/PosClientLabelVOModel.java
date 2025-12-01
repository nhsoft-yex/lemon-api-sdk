package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientLabelVO模型
 * 客户标签
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientLabelVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户标签编号", example="1")
    private Integer id;
    @ApiCloudField(value="客户标签名称", example="标签B")
    private String name;
}
