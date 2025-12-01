package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店要货模板编号", example="434401000085")
    private Long templateNum;
    @ApiCloudField(value="门店要货模板名称", example="1门店要货模板")
    private String templateName;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="门店要货模板详情", example="")
    private List<RequestTemplateDetailResponseDTOModel> templateDetails;
}
