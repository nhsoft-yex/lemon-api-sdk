package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyItemTemplateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import com.nhsoft.neptune.api.domain.PosItemPolicyTemplateVOModel;

import java.util.*;

/**
 * findPosItemPromotionTemplates请求类
 * 促销商品模板根据模版编号批量查询
 */
public class PolicyItemTemplateFindbynosRequest implements ApiCloudRequest<PolicyItemTemplateFindDTOModel, List<PosItemPolicyTemplateVOModel>> {

    private PolicyItemTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.item.template.findbynos";
    }

    @Override
    public PolicyItemTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyItemTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemPolicyTemplateVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemPolicyTemplateVOModel>>>() {};
    }

}
