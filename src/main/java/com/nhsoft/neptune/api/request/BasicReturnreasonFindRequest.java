package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerOrderReasonResponseDTOModel;

import java.util.*;

/**
 * findReturnReason请求类
 * 退货申请原因查询
 */
public class BasicReturnreasonFindRequest implements ApiCloudRequest<Void, InnerOrderReasonResponseDTOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.returnreason.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderReasonResponseDTOModel>>() {};
    }

}
