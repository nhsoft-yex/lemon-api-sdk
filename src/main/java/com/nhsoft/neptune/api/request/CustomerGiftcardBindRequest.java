package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardBindDTOModel;

import java.util.*;

/**
 * bindGiftCard请求类
 * 会员礼品卡绑定
 */
public class CustomerGiftcardBindRequest implements ApiCloudRequest<GiftCardBindDTOModel, Void> {

    private GiftCardBindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.bind";
    }

    @Override
    public GiftCardBindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardBindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
