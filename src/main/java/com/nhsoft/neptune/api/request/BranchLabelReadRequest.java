package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchLabelFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchLabelV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchLabelV2DTOModel;

import java.util.*;

/**
 * readBranchLabel请求类
 * 查询门店标签信息
 */
public class BranchLabelReadRequest implements ApiCloudRequest<BranchLabelFindDTOModel, List<BranchLabelV2DTOModel>> {

    private BranchLabelFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.label.read";
    }

    @Override
    public BranchLabelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchLabelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchLabelV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchLabelV2DTOModel>>>() {};
    }

}
