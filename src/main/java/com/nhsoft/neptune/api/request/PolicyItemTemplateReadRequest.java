package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateReadDTOModel;

import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import java.util.*;

/**
 * read_21请求类
 * 促销商品模版读取
 */
public class PolicyItemTemplateReadRequest implements ApiCloudRequest<PosItemPolicyTemplateReadDTOModel, PosItemPolicyTemplateVOModel> {

    private PosItemPolicyTemplateReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.read";
    }

    @Override
    public PosItemPolicyTemplateReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemPolicyTemplateReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemPolicyTemplateVOModel>>() {};
    }

}
