package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.CardBranchGroupVOModel;

import com.nhsoft.neptune.api.domain.CardBranchGroupVOModel;

import java.util.*;

/**
 * findCardBranchGroup请求类
 * 卡门店共享分组查询
 */
public class CustomerCardGroupFindRequest implements ApiCloudRequest<Void, List<CardBranchGroupVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.card.group.find";
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
    public TypeReference<ApiCloudResponse<List<CardBranchGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardBranchGroupVOModel>>>() {};
    }

}
