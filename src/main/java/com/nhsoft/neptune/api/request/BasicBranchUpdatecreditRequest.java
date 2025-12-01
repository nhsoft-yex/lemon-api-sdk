package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchUpdateCreditDTOModel;

import com.nhsoft.neptune.api.domain.BranchUpdateCreditDTOModel;

import java.util.*;

/**
 * branchupdatecredit请求类
 * 门店信用额度修改
 */
public class BasicBranchUpdatecreditRequest implements ApiCloudRequest<BranchUpdateCreditDTOModel, BranchUpdateCreditDTOModel> {

    private BranchUpdateCreditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.branch.updatecredit";
    }

    @Override
    public BranchUpdateCreditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchUpdateCreditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchUpdateCreditDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchUpdateCreditDTOModel>>() {};
    }

}
