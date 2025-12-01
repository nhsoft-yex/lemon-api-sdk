package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchLabelCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchLabelCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="标签名称", example="1", required=true)
    private String labelName;
    @ApiCloudField(value="门店编号", example="1")
    private List<Integer> branchNums;
}
