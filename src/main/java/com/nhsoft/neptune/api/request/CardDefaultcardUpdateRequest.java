package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DefaultCardUpdateDTOModel;

import java.util.*;

/**
 * bindCard请求类
 * 会员更新默认储值卡
 */
public class CardDefaultcardUpdateRequest implements ApiCloudRequest<DefaultCardUpdateDTOModel, Void> {

    private DefaultCardUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.defaultcard.update";
    }

    @Override
    public DefaultCardUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DefaultCardUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
