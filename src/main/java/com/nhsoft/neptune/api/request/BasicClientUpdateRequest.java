package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PosClientVOModel;

import java.util.*;

/**
 * clientUpdate请求类
 * 客户修改
 */
public class BasicClientUpdateRequest implements ApiCloudRequest<PosClientUpdateDTOModel, PosClientVOModel> {

    private PosClientUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.update";
    }

    @Override
    public PosClientUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientVOModel>>() {};
    }

}
