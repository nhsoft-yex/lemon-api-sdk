package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ElepriceadjReadV2DTOModel;

import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import java.util.*;

/**
 * readElePriceAdj请求类
 * 成分商品调价读取
 */
public class BasicElepriceadjReadRequest implements ApiCloudRequest<ElepriceadjReadV2DTOModel, ElepriceadjV2DTOModel> {

    private ElepriceadjReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.elepriceadj.read";
    }

    @Override
    public ElepriceadjReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ElepriceadjReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ElepriceadjV2DTOModel>>() {};
    }

}
