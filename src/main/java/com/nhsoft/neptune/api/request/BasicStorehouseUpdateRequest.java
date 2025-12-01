package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StorehouseUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.StorehouseUpdateV2DTOModel;

import java.util.*;

/**
 * storehouseUpdate请求类
 * 仓库修改
 */
public class BasicStorehouseUpdateRequest implements ApiCloudRequest<StorehouseUpdateV2DTOModel, StorehouseUpdateV2DTOModel> {

    private StorehouseUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.storehouse.update";
    }

    @Override
    public StorehouseUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StorehouseUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>>() {};
    }

}
