package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosOrderFindV2VOModel;

import java.util.*;

/**
 * posOrderSaveV2请求类
 * 销售单据新增
 */
public class PosOrderSavev2Request implements ApiCloudRequest<PosOrderSaveDTOModel, PosOrderFindV2VOModel> {

    private PosOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.save/v2";
    }

    @Override
    public PosOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosOrderFindV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosOrderFindV2VOModel>>() {};
    }

}
