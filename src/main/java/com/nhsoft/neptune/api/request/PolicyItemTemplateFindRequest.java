package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import java.util.*;

/**
 * find_17请求类
 * 促销商品模版查询
 */
public class PolicyItemTemplateFindRequest implements ApiCloudRequest<PosItemPolicyTemplateFindDTOModel, List<PosItemPolicyTemplateVOModel>> {

    private PosItemPolicyTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.find";
    }

    @Override
    public PosItemPolicyTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemPolicyTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemPolicyTemplateVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemPolicyTemplateVOModel>>>() {};
    }

}
