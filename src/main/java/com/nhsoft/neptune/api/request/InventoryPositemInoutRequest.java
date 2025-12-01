package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemDiffLogFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemDiffLogVOModel;

import com.nhsoft.neptune.api.domain.PosItemDiffLogVOModel;

import java.util.*;

/**
 * findInventorDiffPosItemLog请求类
 * 商品库存变动差异查询
 */
public class InventoryPositemInoutRequest implements ApiCloudRequest<PosItemDiffLogFindDTOModel, List<PosItemDiffLogVOModel>> {

    private PosItemDiffLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.positem.inout";
    }

    @Override
    public PosItemDiffLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemDiffLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemDiffLogVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemDiffLogVOModel>>>() {};
    }

}
