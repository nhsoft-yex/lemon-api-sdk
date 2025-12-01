package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchGroupingDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchGroupingDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="")
    private String branchName;
}
