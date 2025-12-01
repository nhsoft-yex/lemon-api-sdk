package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ElepriceadjSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import java.util.*;

/**
 * elepriceadjSave请求类
 * 成分商品调价新增
 */
public class BasicElepriceadjSaveRequest implements ApiCloudRequest<ElepriceadjSaveV2DTOModel, ElepriceadjV2DTOModel> {

    private ElepriceadjSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.elepriceadj.save";
    }

    @Override
    public ElepriceadjSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ElepriceadjSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>>() {};
    }

}
