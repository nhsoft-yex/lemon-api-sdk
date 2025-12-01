package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTimeFindDTOModel;

import com.nhsoft.neptune.api.domain.RequestTimeDTOModel;

import java.util.*;

/**
 * requestTimeFind请求类
 * 门店的要货时间设置查询
 */
public class ChainRequesttimeFindRequest implements ApiCloudRequest<RequestTimeFindDTOModel, RequestTimeDTOModel> {

    private RequestTimeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.requesttime.find";
    }

    @Override
    public RequestTimeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTimeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestTimeDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestTimeDTOModel>>() {};
    }

}
