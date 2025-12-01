package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchAccountInOutFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchAccountInOutVOModel;

import com.nhsoft.neptune.api.domain.BranchAccountInOutVOModel;

import java.util.*;

/**
 * findBranchAccountInOut请求类
 * 门店账户往来明细
 */
public class BranchAccountInoutFindRequest implements ApiCloudRequest<BranchAccountInOutFindDTOModel, List<BranchAccountInOutVOModel>> {

    private BranchAccountInOutFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.account.inout.find";
    }

    @Override
    public BranchAccountInOutFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchAccountInOutFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchAccountInOutVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchAccountInOutVOModel>>>() {};
    }

}
