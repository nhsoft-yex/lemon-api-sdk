package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AssembleSplitSaveDTOModel;

import com.nhsoft.neptune.api.domain.AssembleSplitVOModel;

import java.util.*;

/**
 * saveandauditAssembleSplitOrder请求类
 * 新增并审核组合拆分单
 */
public class InventoryAssembleSplitSaveandauditRequest implements ApiCloudRequest<AssembleSplitSaveDTOModel, AssembleSplitVOModel> {

    private AssembleSplitSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.assemble.split.saveandaudit";
    }

    @Override
    public AssembleSplitSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AssembleSplitSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AssembleSplitVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AssembleSplitVOModel>>() {};
    }

}
