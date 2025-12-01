package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardGenerateCodeDTOModel;

import java.util.*;

/**
 * generateCode请求类
 * 生成礼品卡码
 */
public class CustomerGiftcardGeneratecodeRequest implements ApiCloudRequest<GiftCardGenerateCodeDTOModel, String> {

    private GiftCardGenerateCodeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.generatecode";
    }

    @Override
    public GiftCardGenerateCodeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardGenerateCodeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}
