package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerOrderReasonSaveDTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderReasonResponseDTOModel;

import java.util.*;

/**
 * saveReturnReason请求类
 * 退货申请原因新增
 */
public class BasicReturnreasonSaveRequest implements ApiCloudRequest<InnerOrderReasonSaveDTOModel, InnerOrderReasonResponseDTOModel> {

    private InnerOrderReasonSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.returnreason.save";
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
