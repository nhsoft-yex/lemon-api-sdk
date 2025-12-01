package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StorehouseFindV2DTOModel;

import com.nhsoft.neptune.api.domain.StorehouseUpdateV2DTOModel;

import java.util.*;

/**
 * storehouseFind请求类
 * 仓库查询
 */
public class BasicStorehouseFindRequest implements ApiCloudRequest<StorehouseFindV2DTOModel, StorehouseUpdateV2DTOModel> {

    private StorehouseFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.storehouse.find";
    }

    @Override
    public StorehouseFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StorehouseFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>>() {};
    }

}
