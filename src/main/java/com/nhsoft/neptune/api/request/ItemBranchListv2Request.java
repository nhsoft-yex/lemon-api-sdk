package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemBranchListFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreMatrixVOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixVOModel;

import java.util.*;

/**
 * listBranchItem_1请求类
 * 门店价格查询
 */
public class ItemBranchListv2Request implements ApiCloudRequest<ItemBranchListFindDTOModel, List<StoreMatrixVOModel>> {

    private ItemBranchListFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.item.branch.list/v2";
    }

    @Override
    public ItemBranchListFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemBranchListFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreMatrixVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreMatrixVOModel>>>() {};
    }

}
