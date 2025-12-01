package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyOutBillNoReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import java.util.*;

/**
 * read_9请求类
 * 超额奖励读取
 */
public class PolicyMoneyReadRequest implements ApiCloudRequest<PolicyOutBillNoReadDTOModel, PolicyMoneyVOModel> {

    private PolicyOutBillNoReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.read";
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
    public TypeReference<ApiCloudResponse<PolicyMoneyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyMoneyVOModel>>() {};
    }

}
