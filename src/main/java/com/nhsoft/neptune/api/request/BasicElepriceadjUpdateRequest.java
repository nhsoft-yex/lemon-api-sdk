package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ElepriceadjUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import java.util.*;

/**
 * elepriceadjUpdate请求类
 * 成分商品调价修改
 */
public class BasicElepriceadjUpdateRequest implements ApiCloudRequest<ElepriceadjUpdateV2DTOModel, ElepriceadjV2DTOModel> {

    private ElepriceadjUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.elepriceadj.update";
    }

    @Override
    public ElepriceadjUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ElepriceadjUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>>() {};
    }

}
