package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PickTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PickTaskVOModel;

import com.nhsoft.neptune.api.domain.PickTaskVOModel;

import java.util.*;

/**
 * find_4请求类
 * 拣货计划查询
 */
public class WmsPickTaskFindRequest implements ApiCloudRequest<PickTaskFindDTOModel, List<PickTaskVOModel>> {

    private PickTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.pick.task.find";
    }

    @Override
    public PickTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PickTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PickTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PickTaskVOModel>>>() {};
    }

}
