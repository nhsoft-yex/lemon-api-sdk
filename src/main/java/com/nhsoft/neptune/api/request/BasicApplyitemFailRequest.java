package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ApplyItemFailDTOModel;

import com.nhsoft.neptune.api.domain.ApplyItemDTOModel;

import java.util.*;

/**
 * applyItemFail请求类
 * 新品审核不通过
 */
public class BasicApplyitemFailRequest implements ApiCloudRequest<ApplyItemFailDTOModel, ApplyItemDTOModel> {

    private ApplyItemFailDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.applyitem.fail";
    }

    @Override
    public ApplyItemFailDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ApplyItemFailDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ApplyItemDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ApplyItemDTOModel>>() {};
    }

}
