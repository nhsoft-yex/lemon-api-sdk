package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardConsumeSummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardConsumeSummaryVOModel;

import com.nhsoft.neptune.api.domain.GiftCardConsumeSummaryVOModel;

import java.util.*;

/**
 * summaryGiftCardConsume请求类
 * 礼品卡消费汇总
 */
public class CustomerGiftcardConsumeFindRequest implements ApiCloudRequest<GiftCardConsumeSummaryFindDTOModel, List<GiftCardConsumeSummaryVOModel>> {

    private GiftCardConsumeSummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.consume.find";
    }

    @Override
    public GiftCardConsumeSummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardConsumeSummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardConsumeSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardConsumeSummaryVOModel>>>() {};
    }

}
