package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchAccountEnableDTOModel;

import java.util.*;

/**
 * unableBranchAccount请求类
 * 门店账户停用
 */
public class BranchAccountUnableRequest implements ApiCloudRequest<BranchAccountEnableDTOModel, Object> {

    private BranchAccountEnableDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.account.unable";
    }

    @Override
    public BranchAccountEnableDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchAccountEnableDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
