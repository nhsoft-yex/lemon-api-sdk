package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutBranchRelateReadDTOModel;

import com.nhsoft.neptune.api.domain.OutBranchRelateVOModel;

import java.util.*;

/**
 * read_29请求类
 * 三方平台门店读取
 */
public class CustomerOutbranchrelateReadRequest implements ApiCloudRequest<OutBranchRelateReadDTOModel, OutBranchRelateVOModel> {

    private OutBranchRelateReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.outbranchrelate.read";
    }

    @Override
    public OutBranchRelateReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutBranchRelateReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OutBranchRelateVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OutBranchRelateVOModel>>() {};
    }

}
