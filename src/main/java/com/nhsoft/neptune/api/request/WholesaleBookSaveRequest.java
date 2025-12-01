package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleBookSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleBookVOModel;

import java.util.*;

/**
 * wholesaleBookSave请求类
 * 批发订单新增
 */
public class WholesaleBookSaveRequest implements ApiCloudRequest<WholesaleBookSaveDTOModel, WholesaleBookVOModel> {

    private WholesaleBookSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.book.save";
    }

    @Override
    public WholesaleBookSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleBookSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleBookVOModel>>() {};
    }

}
