package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsOtherInComeSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsOtherInComeFullyVOModel;

import java.util.*;

/**
 * saveAndAudit请求类
 * 批发其他收入单新增并审核
 */
public class WhsOtherIncomeSaveandauditRequest implements ApiCloudRequest<WhsOtherInComeSaveDTOModel, WhsOtherInComeFullyVOModel> {

    private WhsOtherInComeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.other.income.saveandaudit";
    }

    @Override
    public WhsOtherInComeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsOtherInComeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsOtherInComeFullyVOModel>>() {};
    }

}
