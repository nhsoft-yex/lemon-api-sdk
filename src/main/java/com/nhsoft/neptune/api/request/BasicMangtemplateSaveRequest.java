package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplateSaveDTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateResponseDTOModel;

import java.util.*;

/**
 * saveManagementTemplate请求类
 * 经营商品范围模板新增
 */
public class BasicMangtemplateSaveRequest implements ApiCloudRequest<ManagementTemplateSaveDTOModel, ManagementTemplateResponseDTOModel> {

    private ManagementTemplateSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.save";
    }

    @Override
    public ManagementTemplateSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplateSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ManagementTemplateResponseDTOModel>>() {};
    }

}
