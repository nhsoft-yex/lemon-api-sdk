package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RelatCardReqDTOModel;

import com.nhsoft.neptune.api.domain.RelatCardResponseDTOModel;

import java.util.*;

/**
 * relatCard请求类
 * 储值卡续卡
 */
public class CardRelatRequest implements ApiCloudRequest<RelatCardReqDTOModel, RelatCardResponseDTOModel> {

    private RelatCardReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.relat";
    }

    @Override
    public RelatCardReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RelatCardReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RelatCardResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RelatCardResponseDTOModel>>() {};
    }

}
