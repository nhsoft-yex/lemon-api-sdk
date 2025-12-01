package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceivableOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceivableOrderVOModel;

import com.nhsoft.neptune.api.domain.ReceivableOrderVOModel;

import java.util.*;

/**
 * findReceivableOrder请求类
 * 应收单查询
 */
public class FundReceivableOrderFindRequest implements ApiCloudRequest<ReceivableOrderFindDTOModel, List<ReceivableOrderVOModel>> {

    private ReceivableOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receivable.order.find";
    }

    @Override
    public ReceivableOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceivableOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceivableOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceivableOrderVOModel>>>() {};
    }

}
