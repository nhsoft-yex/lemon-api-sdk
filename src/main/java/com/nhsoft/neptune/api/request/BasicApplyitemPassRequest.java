package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ApplyItemPassDTOModel;

import com.nhsoft.neptune.api.domain.ApplyItemDTOModel;

import java.util.*;

/**
 * applyItemPass请求类
 * 新品审核通过
 */
public class BasicApplyitemPassRequest implements ApiCloudRequest<ApplyItemPassDTOModel, ApplyItemDTOModel> {

    private ApplyItemPassDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.applyitem.pass";
    }

    @Override
    public ApplyItemPassDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ApplyItemPassDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ApplyItemDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ApplyItemDTOModel>>() {};
    }

}
