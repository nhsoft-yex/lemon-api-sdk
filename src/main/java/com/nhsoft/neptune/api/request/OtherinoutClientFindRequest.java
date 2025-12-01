package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientOtherInoutFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import java.util.*;

/**
 * clientOtherInoutFind请求类
 * 客户费用单查询
 */
public class OtherinoutClientFindRequest implements ApiCloudRequest<ClientOtherInoutFindDTOModel, List<ClientOtherInoutDTOModel>> {

    private ClientOtherInoutFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.client.find";
    }

    @Override
    public ClientOtherInoutFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientOtherInoutFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientOtherInoutDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientOtherInoutDTOModel>>>() {};
    }

}
