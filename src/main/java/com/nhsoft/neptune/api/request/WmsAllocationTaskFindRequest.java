package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AllocationTaskVOModel;

import com.nhsoft.neptune.api.domain.AllocationTaskVOModel;

import java.util.*;

/**
 * findTask请求类
 * 移库记录查询
 */
public class WmsAllocationTaskFindRequest implements ApiCloudRequest<AllocationTaskFindDTOModel, List<AllocationTaskVOModel>> {

    private AllocationTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.allocation.task.find";
    }

    @Override
    public AllocationTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AllocationTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AllocationTaskVOModel>>>() {};
    }

}
