package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookPayConfirmDTOModel;

import java.util.*;

/**
 * payConfirm请求类
 * 批发订单付款确认
 */
public class WholesaleBookPayconfirmRequest implements ApiCloudRequest<WholesaleBookPayConfirmDTOModel, Object> {

    private WholesaleBookPayConfirmDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.payconfirm";
    }

    @Override
    public WholesaleBookPayConfirmDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookPayConfirmDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
