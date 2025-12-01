package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营商品范围模板编码", example="1", required=true)
    private Integer managementTemplateNum;
    @ApiCloudField(value="经营商品范围模板名称", example="测试模板")
    private String managementTemplateName;
    @ApiCloudField(value="应用门店编码(不能修改到无应用门店)", example="1,2,3,4,5")
    private List<Integer> applyBranchNums;
}
