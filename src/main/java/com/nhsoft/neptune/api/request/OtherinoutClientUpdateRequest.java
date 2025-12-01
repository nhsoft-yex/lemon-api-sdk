package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientOtherInoutUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import java.util.*;

/**
 * clientOtherInoutUpdate请求类
 * 客户费用单更新
 */
public class OtherinoutClientUpdateRequest implements ApiCloudRequest<ClientOtherInoutUpdateDTOModel, ClientOtherInoutDTOModel> {

    private ClientOtherInoutUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.client.update";
    }

    @Override
    public ClientOtherInoutUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientOtherInoutUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>>() {};
    }

}
