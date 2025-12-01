package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckPlanReadDTOModel;

import com.nhsoft.neptune.api.domain.CheckPlanVOModel;

import java.util.*;

/**
 * read_16请求类
 * 盘点任务读取
 */
public class WmsCheckPlanReadRequest implements ApiCloudRequest<CheckPlanReadDTOModel, CheckPlanVOModel> {

    private CheckPlanReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.plan.read";
    }

    @Override
    public CheckPlanReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckPlanReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckPlanVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckPlanVOModel>>() {};
    }

}
