package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManagementTemplateItemAddDTOModel;

import java.util.*;

/**
 * deleteManagementTemplateItem请求类
 * 经营商品范围模板删除商品
 */
public class BasicMangtemplateItemDeleteRequest implements ApiCloudRequest<ManagementTemplateItemAddDTOModel, Void> {

    private ManagementTemplateItemAddDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.mangtemplate.item.delete";
    }

    @Override
    public ManagementTemplateItemAddDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManagementTemplateItemAddDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
