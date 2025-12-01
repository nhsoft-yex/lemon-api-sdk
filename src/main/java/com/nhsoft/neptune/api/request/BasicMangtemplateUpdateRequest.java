package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplateUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import java.util.*;

/**
 * updateManagementTemplate请求类
 * 经营商品范围模板修改
 */
public class BasicMangtemplateUpdateRequest implements ApiCloudRequest<ManagementTemplateUpdateDTOModel, ManagementTemplateResponseDTOModel> {

    private ManagementTemplateUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.update";
    }

    @Override
    public ManagementTemplateUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplateUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>>() {};
    }

}
