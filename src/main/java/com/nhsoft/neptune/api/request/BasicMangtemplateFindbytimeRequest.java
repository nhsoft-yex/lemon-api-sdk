package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplatePageDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import java.util.*;

/**
 * findManagementTemplate请求类
 * 经营商品范围模板根据更新时间分页查询
 */
public class BasicMangtemplateFindbytimeRequest implements ApiCloudRequest<ManagementTemplatePageDTOModel, List<ManagementTemplateResponseDTOModel>> {

    private ManagementTemplatePageDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.findbytime";
    }

    @Override
    public ManagementTemplatePageDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplatePageDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ManagementTemplateResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ManagementTemplateResponseDTOModel>>>() {};
    }

}
