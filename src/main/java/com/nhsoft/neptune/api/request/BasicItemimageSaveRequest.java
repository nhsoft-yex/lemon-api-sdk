package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosImageSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosImageResponseDTOModel;

import com.nhsoft.neptune.api.domain.PosImageResponseDTOModel;

import java.util.*;

/**
 * posImageSave请求类
 * 清空并新增商品图片
 */
public class BasicItemimageSaveRequest implements ApiCloudRequest<PosImageSaveDTOModel, List<PosImageResponseDTOModel>> {

    private PosImageSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemimage.save";
    }

    @Override
    public PosImageSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosImageSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosImageResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosImageResponseDTOModel>>>() {};
    }

}
