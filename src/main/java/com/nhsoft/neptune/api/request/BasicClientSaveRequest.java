package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosClientVOModel;

import java.util.*;

/**
 * clientSave请求类
 * 客户新增
 */
public class BasicClientSaveRequest implements ApiCloudRequest<PosClientSaveDTOModel, PosClientVOModel> {

    private PosClientSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.save";
    }

    @Override
    public PosClientSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientVOModel>>() {};
    }

}
