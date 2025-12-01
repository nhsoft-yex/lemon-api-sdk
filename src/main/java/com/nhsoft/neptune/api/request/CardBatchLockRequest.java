package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserNumListDTOModel;

import java.util.*;

/**
 * batchLockCard请求类
 * 储值卡批量锁定
 */
public class CardBatchLockRequest implements ApiCloudRequest<CardUserNumListDTOModel, Void> {

    private CardUserNumListDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.batch.lock";
    }

    @Override
    public CardUserNumListDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserNumListDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
