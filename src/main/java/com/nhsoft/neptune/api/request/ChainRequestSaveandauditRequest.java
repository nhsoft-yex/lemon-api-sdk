package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestSaveAndAudit请求类
 * 要货单保存加审核
 */
public class ChainRequestSaveandauditRequest implements ApiCloudRequest<RequestSaveV2DTOModel, RequestOrderVOModel> {

    private RequestSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.saveandaudit";
    }

    @Override
    public RequestSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestOrderVOModel>>() {};
    }

}
