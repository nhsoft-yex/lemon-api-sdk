package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOrderAuditDTOModel;

import com.nhsoft.neptune.api.domain.CardOrderResponseDTOModel;

import java.util.*;

/**
 * auditCardOrder请求类
 * 团购制卡审核
 */
public class CardorderAuditRequest implements ApiCloudRequest<CardOrderAuditDTOModel, CardOrderResponseDTOModel> {

    private CardOrderAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardorder.audit";
    }

    @Override
    public CardOrderAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOrderAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>>() {};
    }

}
