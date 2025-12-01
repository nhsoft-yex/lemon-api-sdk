package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixPartBatchUpdateV2DTOModel;

import java.util.*;

/**
 * updateStoreMatrix请求类
 * 批量修改门店商品属性
 */
public class BranchStorematrixUpdateRequest implements ApiCloudRequest<StoreMatrixPartBatchUpdateV2DTOModel, Void> {

    private StoreMatrixPartBatchUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.storematrix.update";
    }

    @Override
    public StoreMatrixPartBatchUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixPartBatchUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
