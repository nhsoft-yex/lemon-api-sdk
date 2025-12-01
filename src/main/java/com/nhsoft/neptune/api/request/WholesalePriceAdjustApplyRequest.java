package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesalePriceAdjustApplyDTOModel;

import java.util.*;

/**
 * applyWholesalePriceAdjust请求类
 * 批发价调整单应用
 */
public class WholesalePriceAdjustApplyRequest implements ApiCloudRequest<WholesalePriceAdjustApplyDTOModel, Void> {

    private WholesalePriceAdjustApplyDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.price.adjust.apply";
    }

    @Override
    public WholesalePriceAdjustApplyDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesalePriceAdjustApplyDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
