package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营商品范围模板名称", example="测试模板", required=true)
    private String managementTemplateName;
    @ApiCloudField(value="所属门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码，空表示所有门店都应用", example="1,2,3,4,5")
    private List<Integer> applyBranchNums;
}
