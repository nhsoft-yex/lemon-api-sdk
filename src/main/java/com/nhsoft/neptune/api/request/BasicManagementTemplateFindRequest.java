package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ManageTemplateFindByItemNumDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ManagementTemplateV2DTOModel;

import com.nhsoft.neptune.api.domain.ManagementTemplateV2DTOModel;

import java.util.*;

/**
 * findManagementTemplateByItemNum请求类
 * 根据商品档案查询经营范围
 */
public class BasicManagementTemplateFindRequest implements ApiCloudRequest<ManageTemplateFindByItemNumDTOModel, List<ManagementTemplateV2DTOModel>> {

    private ManageTemplateFindByItemNumDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.management.template.find";
    }

    @Override
    public ManageTemplateFindByItemNumDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ManageTemplateFindByItemNumDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ManagementTemplateV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ManagementTemplateV2DTOModel>>>() {};
    }

}
