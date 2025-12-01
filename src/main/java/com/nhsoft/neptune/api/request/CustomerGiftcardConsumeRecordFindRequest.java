package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardConsumeRecordFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardConsumeRecordVOModel;

import com.nhsoft.neptune.api.domain.GiftCardConsumeRecordVOModel;

import java.util.*;

/**
 * findGiftCardConsumeRecord请求类
 * 礼品卡消费记录查询
 */
public class CustomerGiftcardConsumeRecordFindRequest implements ApiCloudRequest<GiftCardConsumeRecordFindDTOModel, List<GiftCardConsumeRecordVOModel>> {

    private GiftCardConsumeRecordFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.consume.record.find";
    }

    @Override
    public GiftCardConsumeRecordFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardConsumeRecordFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardConsumeRecordVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardConsumeRecordVOModel>>>() {};
    }

}
