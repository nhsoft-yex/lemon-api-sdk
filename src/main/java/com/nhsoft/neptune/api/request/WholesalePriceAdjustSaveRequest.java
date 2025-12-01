package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderVOModel;

import java.util.*;

/**
 * saveWholesalePriceAdjust请求类
 * 批发价调整单新增
 */
public class WholesalePriceAdjustSaveRequest implements ApiCloudRequest<WholesalePriceAdjustOrderSaveDTOModel, WholesalePriceAdjustOrderVOModel> {

    private WholesalePriceAdjustOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.price.adjust.save";
    }

    @Override
    public WholesalePriceAdjustOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesalePriceAdjustOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesalePriceAdjustOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesalePriceAdjustOrderVOModel>>() {};
    }

}
