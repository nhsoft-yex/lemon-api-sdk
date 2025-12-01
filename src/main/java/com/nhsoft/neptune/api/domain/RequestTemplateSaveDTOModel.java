package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="门店要货模板名称", example="1门店要货模板", required=true)
    private String templateName;
    @ApiCloudField(value="应用门店", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="门店要货模板详情", example="", required=true)
    private List<RequestTemplateDetailSaveDTOModel> templateDetails;
}
