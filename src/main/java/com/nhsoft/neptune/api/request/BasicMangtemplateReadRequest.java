package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplateReadDTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import java.util.*;

/**
 * readManagementTemplate请求类
 * 经营商品范围模板读取
 */
public class BasicMangtemplateReadRequest implements ApiCloudRequest<ManagementTemplateReadDTOModel, ManagementTemplateResponseDTOModel> {

    private ManagementTemplateReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.read";
    }

    @Override
    public ManagementTemplateReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplateReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>>() {};
    }

}
