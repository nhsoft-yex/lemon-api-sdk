package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsOtherInComeSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsOtherInComeFullyVOModel;

import java.util.*;

/**
 * save_4请求类
 * 批发其他收入单新增
 */
public class WhsOtherIncomeSaveRequest implements ApiCloudRequest<WhsOtherInComeSaveDTOModel, WhsOtherInComeFullyVOModel> {

    private WhsOtherInComeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.other.income.save";
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
