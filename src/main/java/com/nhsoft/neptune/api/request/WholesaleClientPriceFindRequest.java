package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemClientFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreItemClientVOModel;

import com.nhsoft.neptune.api.domain.StoreItemClientVOModel;

import java.util.*;

/**
 * storeItemClientFind请求类
 * 客户批发价查询
 */
public class WholesaleClientPriceFindRequest implements ApiCloudRequest<StoreItemClientFindDTOModel, List<StoreItemClientVOModel>> {

    private StoreItemClientFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.client.price.find";
    }

    @Override
    public StoreItemClientFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemClientFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreItemClientVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreItemClientVOModel>>>() {};
    }

}
