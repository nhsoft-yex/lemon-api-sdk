package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientAddressVOModel;

import com.nhsoft.neptune.api.domain.ClientAddressVOModel;

import java.util.*;

/**
 * findAddress请求类
 * 客户地址列表查询
 */
public class BasicClientAddressReadRequest implements ApiCloudRequest<PosClientIdDTOModel, List<ClientAddressVOModel>> {

    private PosClientIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.address.read";
    }

    @Override
    public PosClientIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientAddressVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientAddressVOModel>>>() {};
    }

}
