package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardBranchGroupSaveDTOModel;

import com.nhsoft.neptune.api.domain.CardBranchGroupVOModel;

import java.util.*;

/**
 * saveCardBranchGroup请求类
 * 卡门店共享分组保存
 */
public class CustomerCardGroupSaveRequest implements ApiCloudRequest<CardBranchGroupSaveDTOModel, CardBranchGroupVOModel> {

    private CardBranchGroupSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.card.group.save";
    }

    @Override
    public CardBranchGroupSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardBranchGroupSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardBranchGroupVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardBranchGroupVOModel>>() {};
    }

}
