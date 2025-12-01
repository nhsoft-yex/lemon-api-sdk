package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderFindV2ReqModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderFind_1请求类
 * 批发销售单查询
 */
public class WholesaleOrderFindv2Request implements ApiCloudRequest<WholesaleOrderFindV2ReqModel, List<WholesaleOrderVOModel>> {

    private WholesaleOrderFindV2ReqModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.find/v2";
    }

    @Override
    public WholesaleOrderFindV2ReqModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderFindV2ReqModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>>() {};
    }

}
