package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerOrderReasonSaveDTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderReasonResponseDTOModel;

import java.util.*;

/**
 * updateReturnReason请求类
 * 退货申请原因更新
 */
public class BasicReturnreasonUpdateRequest implements ApiCloudRequest<InnerOrderReasonSaveDTOModel, InnerOrderReasonResponseDTOModel> {

    private InnerOrderReasonSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.returnreason.update";
    }

    @Override
    public InnerOrderReasonSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerOrderReasonSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>>() {};
    }

}
