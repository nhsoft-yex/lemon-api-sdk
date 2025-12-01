package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTimeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTimeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="部门名称或类别代码", example="99", required=true)
    private String name;
}
