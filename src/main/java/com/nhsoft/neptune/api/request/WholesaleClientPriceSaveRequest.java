package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemClientSaveDTOModel;

import java.util.*;

/**
 * storeItemClientSave请求类
 * 客户批发价保存
 */
public class WholesaleClientPriceSaveRequest implements ApiCloudRequest<StoreItemClientSaveDTOModel, Object> {

    private StoreItemClientSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.client.price.save";
    }

    @Override
    public StoreItemClientSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemClientSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
