package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicBranchUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.BasicBranchV2DTOModel;

import java.util.*;

/**
 * updateBranchMatrix请求类
 * 更新门店及扩展信息
 */
public class BranchMatrixUpdateRequest implements ApiCloudRequest<BasicBranchUpdateV2DTOModel, BasicBranchV2DTOModel> {

    private BasicBranchUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.matrix.update";
    }

    @Override
    public BasicBranchUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicBranchUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasicBranchV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasicBranchV2DTOModel>>() {};
    }

}
