package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="区域编码", example="1")
    private Integer branchRegionNum;
    @ApiCloudField(value="门店代码", example="1")
    private String branchCode;
    @ApiCloudField(value="门店名称", example="测试门店")
    private String branchName;
}
