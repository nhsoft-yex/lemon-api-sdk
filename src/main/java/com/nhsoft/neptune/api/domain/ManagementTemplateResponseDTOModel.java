package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营商品范围模板编码", example="1")
    private Object managementTemplateNum;
    @ApiCloudField(value="经营商品范围模板名称", example="模板名称")
    private String managementTemplateName;
    @ApiCloudField(value="所属门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码", example="1")
    private List<Integer> applyBranchNum;
    @ApiCloudField(value="商品明细", example="")
    private List<ManagementTemplateDetailResponseDTOModel> managementTemplateDetails;
}
