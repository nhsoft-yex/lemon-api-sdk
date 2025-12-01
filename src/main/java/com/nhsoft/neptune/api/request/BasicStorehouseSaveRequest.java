package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StorehouseSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.StorehouseUpdateV2DTOModel;

import java.util.*;

/**
 * storehouseSave请求类
 * 仓库新增
 */
public class BasicStorehouseSaveRequest implements ApiCloudRequest<StorehouseSaveV2DTOModel, StorehouseUpdateV2DTOModel> {

    private StorehouseSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.storehouse.save";
    }

    @Override
    public StorehouseSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StorehouseSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StorehouseUpdateV2DTOModel>>() {};
    }

}
