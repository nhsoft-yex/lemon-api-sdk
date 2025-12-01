package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookStopDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import java.util.*;

/**
 * cancel_2请求类
 * 批发订单作废
 */
public class WholesaleBookCancelRequest implements ApiCloudRequest<WholesaleBookStopDTOModel, WholesaleBookVOModel> {

    private WholesaleBookStopDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.cancel";
    }

    @Override
    public WholesaleBookStopDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookStopDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleBookVOModel>>() {};
    }

}
