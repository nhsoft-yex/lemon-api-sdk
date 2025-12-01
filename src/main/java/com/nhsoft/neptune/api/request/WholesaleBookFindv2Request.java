package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import java.util.*;

/**
 * wholesaleBookFindV2请求类
 * 批发订单查询
 */
public class WholesaleBookFindv2Request implements ApiCloudRequest<WholesaleBookFindV2DTOModel, List<WholesaleBookVOModel>> {

    private WholesaleBookFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.find/v2";
    }

    @Override
    public WholesaleBookFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleBookVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleBookVOModel>>>() {};
    }

}
