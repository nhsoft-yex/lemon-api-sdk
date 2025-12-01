package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.StoreMatrixRegularPriceUpdateDTOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixRegularPriceUpdateDTOModel;

import java.util.*;

/**
 * updateBranchRegularPrice请求类
 * 批量修改门店商品零售价格
 */
public class BranchRegularpriceUpdateRequest implements ApiCloudRequest<List<StoreMatrixRegularPriceUpdateDTOModel>, Void> {

    private List<StoreMatrixRegularPriceUpdateDTOModel> bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.regularprice.update";
    }

    @Override
    public List<StoreMatrixRegularPriceUpdateDTOModel> getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(List<StoreMatrixRegularPriceUpdateDTOModel> bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
