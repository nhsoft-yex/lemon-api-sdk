package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveApplyOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.ReceiveApplyOrderVOModel;

import java.util.*;

/**
 * readReceiveApplyOrder请求类
 * 收款冻结单读取
 */
public class FundReceiveapplyOrderReadRequest implements ApiCloudRequest<ReceiveApplyOrderReadDTOModel, ReceiveApplyOrderVOModel> {

    private ReceiveApplyOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receiveapply.order.read";
    }

    @Override
    public ReceiveApplyOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveApplyOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiveApplyOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiveApplyOrderVOModel>>() {};
    }

}
