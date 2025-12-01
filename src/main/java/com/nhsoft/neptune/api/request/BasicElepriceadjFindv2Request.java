package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ElepriceadjFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import com.nhsoft.neptune.api.domain.ElepriceadjV2DTOModel;

import java.util.*;

/**
 * findElepriceadjV2请求类
 * 成分商品调价查询
 */
public class BasicElepriceadjFindv2Request implements ApiCloudRequest<ElepriceadjFindV3DTOModel, List<ElepriceadjV2DTOModel>> {

    private ElepriceadjFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.elepriceadj.find/v2";
    }

    @Override
    public ElepriceadjFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ElepriceadjFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ElepriceadjV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ElepriceadjV2DTOModel>>>() {};
    }

}
