package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AssembleSplitReadDTOModel;

import com.nhsoft.neptune.api.domain.AssembleSplitVOModel;

import java.util.*;

/**
 * readAssembleSplitOrder请求类
 * 读取组合拆分单
 */
public class InventoryAssembleSplitReadRequest implements ApiCloudRequest<AssembleSplitReadDTOModel, AssembleSplitVOModel> {

    private AssembleSplitReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.assemble.split.read";
    }

    @Override
    public AssembleSplitReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AssembleSplitReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AssembleSplitVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AssembleSplitVOModel>>() {};
    }

}
