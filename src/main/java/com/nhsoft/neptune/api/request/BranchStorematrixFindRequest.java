package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixPartV2FindDTOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixPartV2DTOModel;

import java.util.*;

/**
 * findStoreMatrix_1请求类
 * 读取门店商品属性
 */
public class BranchStorematrixFindRequest implements ApiCloudRequest<StoreMatrixPartV2FindDTOModel, StoreMatrixPartV2DTOModel> {

    private StoreMatrixPartV2FindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.storematrix.find";
    }

    @Override
    public StoreMatrixPartV2FindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixPartV2FindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StoreMatrixPartV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StoreMatrixPartV2DTOModel>>() {};
    }

}
