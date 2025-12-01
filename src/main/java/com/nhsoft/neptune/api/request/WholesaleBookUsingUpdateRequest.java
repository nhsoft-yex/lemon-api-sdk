package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookNoCancelDTOModel;

import java.util.*;

/**
 * noCancel请求类
 * 批发订单状态修改
 */
public class WholesaleBookUsingUpdateRequest implements ApiCloudRequest<WholesaleBookNoCancelDTOModel, Object> {

    private WholesaleBookNoCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.using.update";
    }

    @Override
    public WholesaleBookNoCancelDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookNoCancelDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
