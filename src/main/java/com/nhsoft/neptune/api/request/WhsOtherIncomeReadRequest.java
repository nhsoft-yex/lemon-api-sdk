package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsOtherInComeReadDTOModel;

import com.nhsoft.neptune.api.domain.WhsOtherInComeFullyVOModel;

import java.util.*;

/**
 * audit_11请求类
 * 批发其他收入读取
 */
public class WhsOtherIncomeReadRequest implements ApiCloudRequest<WhsOtherInComeReadDTOModel, WhsOtherInComeFullyVOModel> {

    private WhsOtherInComeReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.other.income.read";
    }

    @Override
    public WhsOtherInComeReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsOtherInComeReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>>() {};
    }

}
