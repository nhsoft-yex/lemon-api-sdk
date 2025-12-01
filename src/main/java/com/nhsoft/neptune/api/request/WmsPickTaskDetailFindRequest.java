package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PickTaskDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PickTaskDetailVOModel;

import com.nhsoft.neptune.api.domain.PickTaskDetailVOModel;

import java.util.*;

/**
 * find_5请求类
 * 拣货明细查询
 */
public class WmsPickTaskDetailFindRequest implements ApiCloudRequest<PickTaskDetailFindDTOModel, List<PickTaskDetailVOModel>> {

    private PickTaskDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.pick.task.detail.find";
    }

    @Override
    public PickTaskDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PickTaskDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PickTaskDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PickTaskDetailVOModel>>>() {};
    }

}
