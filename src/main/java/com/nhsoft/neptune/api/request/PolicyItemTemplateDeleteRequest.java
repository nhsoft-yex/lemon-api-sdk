package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateReadDTOModel;

import java.util.*;

/**
 * update_15请求类
 * 促销商品模版删除
 */
public class PolicyItemTemplateDeleteRequest implements ApiCloudRequest<PosItemPolicyTemplateReadDTOModel, Void> {

    private PosItemPolicyTemplateReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
