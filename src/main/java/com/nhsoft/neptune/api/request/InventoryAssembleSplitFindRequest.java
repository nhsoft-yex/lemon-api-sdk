package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AssembleSplitFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AssembleSplitVOModel;

import com.nhsoft.neptune.api.domain.AssembleSplitVOModel;

import java.util.*;

/**
 * findAssembleSplitOrder请求类
 * 查询组合拆分单
 */
public class InventoryAssembleSplitFindRequest implements ApiCloudRequest<AssembleSplitFindDTOModel, List<AssembleSplitVOModel>> {

    private AssembleSplitFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.assemble.split.find";
    }

    @Override
    public AssembleSplitFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AssembleSplitFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AssembleSplitVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AssembleSplitVOModel>>>() {};
    }

}
