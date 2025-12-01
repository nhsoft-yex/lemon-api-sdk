package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixLastEditTimeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreMatrixPartV2DTOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixPartV2DTOModel;

import java.util.*;

/**
 * findStoreMatrix请求类
 * 增量查询门店商品属性
 */
public class BranchStorematrixFindbyupdatetimeRequest implements ApiCloudRequest<StoreMatrixLastEditTimeFindDTOModel, List<StoreMatrixPartV2DTOModel>> {

    private StoreMatrixLastEditTimeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.storematrix.findbyupdatetime";
    }

    @Override
    public StoreMatrixLastEditTimeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixLastEditTimeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreMatrixPartV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreMatrixPartV2DTOModel>>>() {};
    }

}
