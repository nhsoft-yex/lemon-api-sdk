package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StorehouseReadV2DTOModel;

import com.nhsoft.neptune.api.domain.StorehouseUpdateV2DTOModel;

import java.util.*;

/**
 * storehouseRead请求类
 * 仓库读取
 */
public class BasicStorehouseReadRequest implements ApiCloudRequest<StorehouseReadV2DTOModel, StorehouseUpdateV2DTOModel> {

    private StorehouseReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.storehouse.read";
    }

    @Override
    public StorehouseReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StorehouseReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>>() {};
    }

}
