package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店要货模板编号", example="434401000085", required=true)
    private Long templateNum;
    @ApiCloudField(value="门店要货模板名称", example="门店要货模板")
    private String templateName;
    @ApiCloudField(value="应用门店", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="门店要货模板详情", example="")
    private List<RequestTemplateDetailSaveDTOModel> templateDetails;
}
