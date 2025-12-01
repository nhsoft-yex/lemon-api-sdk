package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutReadDTOModel;

import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import java.util.*;

/**
 * clientOtherInoutRead请求类
 * 客户费用单读取
 */
public class OtherinoutClientReadRequest implements ApiCloudRequest<OtherInoutReadDTOModel, ClientOtherInoutDTOModel> {

    private OtherInoutReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.client.read";
    }

    @Override
    public OtherInoutReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>>() {};
    }

}
