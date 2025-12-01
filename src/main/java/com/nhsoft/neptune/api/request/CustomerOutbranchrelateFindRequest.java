package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutBranchRelateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OutBranchRelateVOModel;

import com.nhsoft.neptune.api.domain.OutBranchRelateVOModel;

import java.util.*;

/**
 * find_21请求类
 * 三方平台门店查询
 */
public class CustomerOutbranchrelateFindRequest implements ApiCloudRequest<OutBranchRelateFindDTOModel, List<OutBranchRelateVOModel>> {

    private OutBranchRelateFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.outbranchrelate.find";
    }

    @Override
    public OutBranchRelateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutBranchRelateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OutBranchRelateVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OutBranchRelateVOModel>>>() {};
    }

}
