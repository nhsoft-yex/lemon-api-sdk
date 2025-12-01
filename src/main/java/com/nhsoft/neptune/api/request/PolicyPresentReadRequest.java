package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyOutBillNoReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPresentVOModel;

import java.util.*;

/**
 * read_8请求类
 * 赠品促销读取
 */
public class PolicyPresentReadRequest implements ApiCloudRequest<PolicyOutBillNoReadDTOModel, PolicyPresentVOModel> {

    private PolicyOutBillNoReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.present.read";
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
    public TypeReference<ApiCloudResponse<PolicyPresentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPresentVOModel>>() {};
    }

}
