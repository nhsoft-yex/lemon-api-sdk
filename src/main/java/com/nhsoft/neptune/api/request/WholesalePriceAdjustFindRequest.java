package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesalePriceAdjustFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderVOModel;

import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderVOModel;

import java.util.*;

/**
 * findWholesalePriceAdjust请求类
 * 批发价调整单查询
 */
public class WholesalePriceAdjustFindRequest implements ApiCloudRequest<WholesalePriceAdjustFindDTOModel, List<WholesalePriceAdjustOrderVOModel>> {

    private WholesalePriceAdjustFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.price.adjust.find";
    }

    @Override
    public WholesalePriceAdjustFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesalePriceAdjustFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesalePriceAdjustOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesalePriceAdjustOrderVOModel>>>() {};
    }

}
