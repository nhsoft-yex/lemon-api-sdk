package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderFindReqModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderFind请求类
 * 批发销售单查询
 */
public class WholesaleOrderFindRequest implements ApiCloudRequest<WholesaleOrderFindReqModel, List<WholesaleOrderVOModel>> {

    private WholesaleOrderFindReqModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.find";
    }

    @Override
    public WholesaleOrderFindReqModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderFindReqModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>>() {};
    }

}
