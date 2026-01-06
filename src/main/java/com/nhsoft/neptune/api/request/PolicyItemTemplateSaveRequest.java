package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import java.util.*;

/**
 * save_17请求类
 * 促销商品模版新增
 */
public class PolicyItemTemplateSaveRequest implements ApiCloudRequest<PosItemPolicyTemplateSaveDTOModel, PosItemPolicyTemplateVOModel> {

    private PosItemPolicyTemplateSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.save";
    }

    @Override
    public PosItemPolicyTemplateSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemPolicyTemplateSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>>() {};
    }

}
