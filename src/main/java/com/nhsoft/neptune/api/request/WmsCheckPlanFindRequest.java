package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckPlanFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CheckPlanVOModel;

import com.nhsoft.neptune.api.domain.CheckPlanVOModel;

import java.util.*;

/**
 * find_11请求类
 * 盘点任务查询
 */
public class WmsCheckPlanFindRequest implements ApiCloudRequest<CheckPlanFindDTOModel, List<CheckPlanVOModel>> {

    private CheckPlanFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.plan.find";
    }

    @Override
    public CheckPlanFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckPlanFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CheckPlanVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CheckPlanVOModel>>>() {};
    }

}
