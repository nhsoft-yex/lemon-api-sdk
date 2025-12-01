package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerOrderReasonDeleteDTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderReasonResponseDTOModel;

import java.util.*;

/**
 * deleteReturnReason请求类
 * 退货申请原因删除
 */
public class BasicReturnreasonDeleteRequest implements ApiCloudRequest<InnerOrderReasonDeleteDTOModel, InnerOrderReasonResponseDTOModel> {

    private InnerOrderReasonDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.returnreason.delete";
    }

    @Override
    public InnerOrderReasonDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerOrderReasonDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>>() {};
    }

}
