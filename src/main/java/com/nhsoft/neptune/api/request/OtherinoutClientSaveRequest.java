package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientOtherInoutSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import java.util.*;

/**
 * clientOtherInoutSave请求类
 * 客户费用单新增
 */
public class OtherinoutClientSaveRequest implements ApiCloudRequest<ClientOtherInoutSaveDTOModel, ClientOtherInoutDTOModel> {

    private ClientOtherInoutSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.client.save";
    }

    @Override
    public ClientOtherInoutSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientOtherInoutSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>>() {};
    }

}
