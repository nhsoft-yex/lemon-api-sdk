package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyOutBillNoReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import java.util.*;

/**
 * read_6请求类
 * 超量特价读取
 */
public class PolicyQuantityReadRequest implements ApiCloudRequest<PolicyOutBillNoReadDTOModel, PolicyQuantityVOModel> {

    private PolicyOutBillNoReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.read";
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
    public TypeReference<ApiCloudResponse<PolicyQuantityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyQuantityVOModel>>() {};
    }

}
