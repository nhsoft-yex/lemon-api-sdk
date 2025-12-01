package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import java.util.*;

/**
 * wholesaleBookUpdate请求类
 * 批发订单修改
 */
public class WholesaleBookUpdateRequest implements ApiCloudRequest<WholesaleBookUpdateDTOModel, WholesaleBookVOModel> {

    private WholesaleBookUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.update";
    }

    @Override
    public WholesaleBookUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleBookVOModel>>() {};
    }

}
