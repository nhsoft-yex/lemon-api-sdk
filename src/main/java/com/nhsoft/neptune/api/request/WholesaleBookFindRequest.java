package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookFindV1DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import java.util.*;

/**
 * wholesaleBookFind请求类
 * 批发订单查询
 */
public class WholesaleBookFindRequest implements ApiCloudRequest<WholesaleBookFindV1DTOModel, List<WholesaleBookVOModel>> {

    private WholesaleBookFindV1DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.find";
    }

    @Override
    public WholesaleBookFindV1DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookFindV1DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleBookVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleBookVOModel>>>() {};
    }

}
