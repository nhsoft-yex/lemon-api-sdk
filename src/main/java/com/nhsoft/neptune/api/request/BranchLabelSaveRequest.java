package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchLabelCreateDTOModel;

import java.util.*;

/**
 * createBranchLabel请求类
 * 新增门店标签
 */
public class BranchLabelSaveRequest implements ApiCloudRequest<BranchLabelCreateDTOModel, Void> {

    private BranchLabelCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.label.save";
    }

    @Override
    public BranchLabelCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchLabelCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
