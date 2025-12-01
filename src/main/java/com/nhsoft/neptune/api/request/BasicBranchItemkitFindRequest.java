package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchItemKitFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchItemKitV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchItemKitV2DTOModel;

import java.util.*;

/**
 * findBranchItemKid请求类
 * 门店制单组合商品档案查询
 */
public class BasicBranchItemkitFindRequest implements ApiCloudRequest<BranchItemKitFindV2DTOModel, List<BranchItemKitV2DTOModel>> {

    private BranchItemKitFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.branch.itemkit.find";
    }

    @Override
    public BranchItemKitFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchItemKitFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchItemKitV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchItemKitV2DTOModel>>>() {};
    }

}
