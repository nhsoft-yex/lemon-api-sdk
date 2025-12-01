package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderUpdate请求类
 * 批发销售单修改
 */
public class WholesaleOrderUpdateRequest implements ApiCloudRequest<WholesaleOrderUpdateDTOModel, WholesaleOrderVOModel> {

    private WholesaleOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.update";
    }

    @Override
    public WholesaleOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleOrderVOModel>>() {};
    }

}
