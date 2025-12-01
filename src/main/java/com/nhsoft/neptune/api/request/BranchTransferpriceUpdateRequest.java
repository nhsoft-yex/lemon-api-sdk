package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixUpdateDTOModel;

import java.util.*;

/**
 * updateBranchTransferPrice请求类
 * 批量修改门店商品配送价格
 */
public class BranchTransferpriceUpdateRequest implements ApiCloudRequest<StoreMatrixUpdateDTOModel, Void> {

    private StoreMatrixUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.transferprice.update";
    }

    @Override
    public StoreMatrixUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
