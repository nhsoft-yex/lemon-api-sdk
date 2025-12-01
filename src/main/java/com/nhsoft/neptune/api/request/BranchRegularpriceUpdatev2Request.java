package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixRegularPriceUpdateV2DTOModel;

import java.util.*;

/**
 * updateBranchRegularPriceV2请求类
 * 批量修改门店商品零售价格
 */
public class BranchRegularpriceUpdatev2Request implements ApiCloudRequest<StoreMatrixRegularPriceUpdateV2DTOModel, Void> {

    private StoreMatrixRegularPriceUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.regularprice.update/v2";
    }

    @Override
    public StoreMatrixRegularPriceUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixRegularPriceUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
