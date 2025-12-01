package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchgroupingFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchGroupingV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchGroupingV2DTOModel;

import java.util.*;

/**
 * readBranchGrouping请求类
 * 门店分组查询
 */
public class BasicBranchgroupingFindRequest implements ApiCloudRequest<BranchgroupingFindDTOModel, List<BranchGroupingV2DTOModel>> {

    private BranchgroupingFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.branchgrouping.find";
    }

    @Override
    public BranchgroupingFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchgroupingFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchGroupingV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchGroupingV2DTOModel>>>() {};
    }

}
