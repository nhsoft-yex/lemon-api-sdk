package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestOrderBatchDTOModel;

import java.util.*;

/**
 * confirmRequest请求类
 * 要货单多单确认
 */
public class ChainRequestConfirmRequest implements ApiCloudRequest<RequestOrderBatchDTOModel, Object> {

    private RequestOrderBatchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.confirm";
    }

    @Override
    public RequestOrderBatchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestOrderBatchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
