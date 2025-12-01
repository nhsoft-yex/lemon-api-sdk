package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchItemSaleCeaseUpdateDTOModel;

import java.util.*;

/**
 * salePriceFind请求类
 * 修改门店商品停售标记
 */
public class RetailBranchitemSaleceaseflagUpdateRequest implements ApiCloudRequest<BranchItemSaleCeaseUpdateDTOModel, Void> {

    private BranchItemSaleCeaseUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.branchitem.saleceaseflag.update";
    }

    @Override
    public BranchItemSaleCeaseUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchItemSaleCeaseUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
