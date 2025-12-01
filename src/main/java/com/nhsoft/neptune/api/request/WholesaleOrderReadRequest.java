package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderRead请求类
 * 批发销售单读取
 */
public class WholesaleOrderReadRequest implements ApiCloudRequest<WholesaleOrderReadDTOModel, WholesaleOrderVOModel> {

    private WholesaleOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.read";
    }

    @Override
    public WholesaleOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleOrderVOModel>>() {};
    }

}
