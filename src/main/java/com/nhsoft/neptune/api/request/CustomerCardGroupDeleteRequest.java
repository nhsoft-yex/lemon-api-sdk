package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardBranchGroupDeleteDTOModel;

import java.util.*;

/**
 * deleteCardBranchGroup请求类
 * 卡门店共享分组删除
 */
public class CustomerCardGroupDeleteRequest implements ApiCloudRequest<CardBranchGroupDeleteDTOModel, Void> {

    private CardBranchGroupDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.card.group.delete";
    }

    @Override
    public CardBranchGroupDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardBranchGroupDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
