package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckPlanSaveDTOModel;

import java.util.*;

/**
 * find_10请求类
 * 盘点计划保存
 */
public class WmsCheckPlanSaveRequest implements ApiCloudRequest<CheckPlanSaveDTOModel, Void> {

    private CheckPlanSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.plan.save";
    }

    @Override
    public CheckPlanSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckPlanSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
