package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import java.util.*;

/**
 * update_14请求类
 * 促销商品模版修改
 */
public class PolicyItemTemplateUpdateRequest implements ApiCloudRequest<PosItemPolicyTemplateUpdateDTOModel, PosItemPolicyTemplateVOModel> {

    private PosItemPolicyTemplateUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.update";
    }

    @Override
    public PosItemPolicyTemplateUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemPolicyTemplateUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>>() {};
    }

}
