package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyOutBillNoReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyDiscountVOModel;

import java.util.*;

/**
 * read_11请求类
 * 超额折扣读取
 */
public class PolicyDiscountReadRequest implements ApiCloudRequest<PolicyOutBillNoReadDTOModel, PolicyDiscountVOModel> {

    private PolicyOutBillNoReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.read";
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
    public TypeReference<ApiCloudResponse<PolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyDiscountVOModel>>() {};
    }

}
