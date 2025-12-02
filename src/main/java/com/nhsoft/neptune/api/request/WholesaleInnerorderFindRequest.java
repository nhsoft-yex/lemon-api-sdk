package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleInnerOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleInnerOrderVOModel;

import com.nhsoft.neptune.api.domain.WholesaleInnerOrderVOModel;

import java.util.*;

/**
 * find_25请求类
 * 售后申请单分页查询
 */
public class WholesaleInnerorderFindRequest implements ApiCloudRequest<WholesaleInnerOrderFindDTOModel, List<WholesaleInnerOrderVOModel>> {

    private WholesaleInnerOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.innerorder.find";
    }

    @Override
    public WholesaleInnerOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleInnerOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleInnerOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleInnerOrderVOModel>>>() {};
    }

}
