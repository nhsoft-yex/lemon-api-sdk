package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutReadDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import java.util.*;

/**
 * branchOtherInoutRead请求类
 * 门店费用单读取
 */
public class OtherinoutBranchReadRequest implements ApiCloudRequest<OtherInoutReadDTOModel, BranchOtherInoutDTOModel> {

    private OtherInoutReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.branch.read";
    }

    @Override
    public OtherInoutReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>>() {};
    }

}
