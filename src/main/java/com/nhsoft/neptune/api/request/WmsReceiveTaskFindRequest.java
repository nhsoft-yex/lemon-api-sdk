package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceiveTaskVOModel;

import com.nhsoft.neptune.api.domain.ReceiveTaskVOModel;

import java.util.*;

/**
 * find_3请求类
 * 收货任务查询
 */
public class WmsReceiveTaskFindRequest implements ApiCloudRequest<ReceiveTaskFindDTOModel, List<ReceiveTaskVOModel>> {

    private ReceiveTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.receive.task.find";
    }

    @Override
    public ReceiveTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceiveTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceiveTaskVOModel>>>() {};
    }

}
