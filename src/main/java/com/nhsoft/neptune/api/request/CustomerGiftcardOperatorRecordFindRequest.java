package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardOperatorRecordFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardOperatorRecordVOModel;

import com.nhsoft.neptune.api.domain.GiftCardOperatorRecordVOModel;

import java.util.*;

/**
 * findGiftCardOperatorRecord请求类
 * 礼品卡操作记录查询
 */
public class CustomerGiftcardOperatorRecordFindRequest implements ApiCloudRequest<GiftCardOperatorRecordFindDTOModel, List<GiftCardOperatorRecordVOModel>> {

    private GiftCardOperatorRecordFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.operator.record.find";
    }

    @Override
    public GiftCardOperatorRecordFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardOperatorRecordFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardOperatorRecordVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardOperatorRecordVOModel>>>() {};
    }

}
