package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import java.util.*;

/**
 * saveBasicItem请求类
 * 新增商品档案
 */
public class BasicItemSaveRequest implements ApiCloudRequest<PosItemSaveV2DTOModel, PosItemFindV2DTOModel> {

    private PosItemSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.save";
    }

    @Override
    public PosItemSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>>() {};
    }

}
