package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchgroupingFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchgroupingFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询关键字", example="测试")
    private String keyword;
}
