package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemBranchListV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreMatrixV2DTOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixV2DTOModel;

import java.util.*;

/**
 * listBranchItem请求类
 * 门店价格查询
 */
public class ItemBranchListRequest implements ApiCloudRequest<ItemBranchListV2DTOModel, List<StoreMatrixV2DTOModel>> {

    private ItemBranchListV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.item.branch.list";
    }

    @Override
    public ItemBranchListV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemBranchListV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreMatrixV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreMatrixV2DTOModel>>>() {};
    }

}
