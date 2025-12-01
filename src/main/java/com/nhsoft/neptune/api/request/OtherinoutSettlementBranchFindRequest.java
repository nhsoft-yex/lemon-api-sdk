package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchOtherInoutDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchOtherInoutDetailDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDetailDTOModel;

import java.util.*;

/**
 * findBranchSettlementDetail请求类
 * 门店往来账款-实收账款(明细)查询
 */
public class OtherinoutSettlementBranchFindRequest implements ApiCloudRequest<BranchOtherInoutDetailFindDTOModel, List<BranchOtherInoutDetailDTOModel>> {

    private BranchOtherInoutDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.settlement.branch.find";
    }

    @Override
    public BranchOtherInoutDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchOtherInoutDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchOtherInoutDetailDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchOtherInoutDetailDTOModel>>>() {};
    }

}
