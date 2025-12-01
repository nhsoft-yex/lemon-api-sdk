package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.*;

/**
 * cardCreateQrcode请求类
 * 根据会员卡生成付款码
 */
public class CardCreateQrcodeRequest implements ApiCloudRequest<String, String> {

    private String bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.create.qrcode";
    }

    @Override
    public String getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(String bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}
