package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ElepriceadjFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import java.util.*;

/**
 * findElepriceadj请求类
 * 成分商品调价查询
 */
public class BasicElepriceadjFindRequest implements ApiCloudRequest<ElepriceadjFindV2DTOModel, List<ElepriceadjV2DTOModel>> {

    private ElepriceadjFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.elepriceadj.find";
    }

    @Override
    public ElepriceadjFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ElepriceadjFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ElepriceadjV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ElepriceadjV2DTOModel>>>() {};
    }

}
