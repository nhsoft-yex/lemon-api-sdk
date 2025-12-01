package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ApplyItemSaveDTOModel;

import com.nhsoft.neptune.api.domain.ApplyItemDTOModel;

import java.util.*;

/**
 * applyItemSave请求类
 * 新品申请
 */
public class BasicApplyitemSaveRequest implements ApiCloudRequest<ApplyItemSaveDTOModel, ApplyItemDTOModel> {

    private ApplyItemSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.applyitem.save";
    }

    @Override
    public ApplyItemSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ApplyItemSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ApplyItemDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ApplyItemDTOModel>>() {};
    }

}
