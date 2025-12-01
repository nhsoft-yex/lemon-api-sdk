package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosMachineFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosMachineVOModel;

import com.nhsoft.neptune.api.domain.PosMachineVOModel;

import java.util.*;

/**
 * findPosMachine请求类
 * 销售终端查询
 */
public class PosMachineFindRequest implements ApiCloudRequest<PosMachineFindDTOModel, List<PosMachineVOModel>> {

    private PosMachineFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.machine.find";
    }

    @Override
    public PosMachineFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosMachineFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosMachineVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosMachineVOModel>>>() {};
    }

}
