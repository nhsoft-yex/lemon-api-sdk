package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import java.util.*;

/**
 * findManagementTemplate_1请求类
 * 经营商品范围模板查询
 */
public class BasicMangtemplateFindRequest implements ApiCloudRequest<ManagementTemplateFindDTOModel, List<ManagementTemplateResponseDTOModel>> {

    private ManagementTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.find";
    }

    @Override
    public ManagementTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ManagementTemplateResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ManagementTemplateResponseDTOModel>>>() {};
    }

}
