package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyOutBillNoReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * read_7请求类
 * 促销特价读取
 */
public class PolicyPromotionReadRequest implements ApiCloudRequest<PolicyOutBillNoReadDTOModel, PolicyPromotionVOModel> {

    private PolicyOutBillNoReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.read";
    }

    @Override
    public PolicyOutBillNoReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyOutBillNoReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPromotionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPromotionVOModel>>() {};
    }

}
