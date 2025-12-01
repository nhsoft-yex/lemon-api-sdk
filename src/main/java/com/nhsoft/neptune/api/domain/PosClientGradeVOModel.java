package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientGradeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientGradeVOModel extends ApiCloudObject {

    @ApiCloudField(value="等级名称", example="甲等")
    private String clientLevelName;
    @ApiCloudField(value="等级名称编码")
    private Integer clientLevelNum;
}
