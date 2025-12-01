package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ApplyPosImageSaveDTOModel;

import java.util.*;

/**
 * saveApplyItemImages请求类
 * 清空并新增新品申请图片
 */
public class BasicApplyitemimageSaveRequest implements ApiCloudRequest<ApplyPosImageSaveDTOModel, Void> {

    private ApplyPosImageSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.applyitemimage.save";
    }

    @Override
    public ApplyPosImageSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ApplyPosImageSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
