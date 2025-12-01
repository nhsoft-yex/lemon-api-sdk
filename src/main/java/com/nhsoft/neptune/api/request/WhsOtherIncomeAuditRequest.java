package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsOtherInComeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WhsOtherInComeFullyVOModel;

import java.util.*;

/**
 * audit_1请求类
 * 批发其他收入审核
 */
public class WhsOtherIncomeAuditRequest implements ApiCloudRequest<WhsOtherInComeUpdateDTOModel, WhsOtherInComeFullyVOModel> {

    private WhsOtherInComeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.other.income.audit";
    }

    @Override
    public WhsOtherInComeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsOtherInComeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>>() {};
    }

}
