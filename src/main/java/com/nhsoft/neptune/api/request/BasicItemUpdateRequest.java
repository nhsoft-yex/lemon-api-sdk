package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import java.util.*;

/**
 * updateBasicItem请求类
 * 修改商品档案
 */
public class BasicItemUpdateRequest implements ApiCloudRequest<PosItemUpdateV2DTOModel, PosItemFindV2DTOModel> {

    private PosItemUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.update";
    }

    @Override
    public PosItemUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>>() {};
    }

}
