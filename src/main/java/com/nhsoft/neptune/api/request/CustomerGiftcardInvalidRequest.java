package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardBatchInvalidDTOModel;

import java.util.*;

/**
 * batchInvalidGiftCard请求类
 * 作废礼品卡
 */
public class CustomerGiftcardInvalidRequest implements ApiCloudRequest<GiftCardBatchInvalidDTOModel, Void> {

    private GiftCardBatchInvalidDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.invalid";
    }

    @Override
    public GiftCardBatchInvalidDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardBatchInvalidDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
