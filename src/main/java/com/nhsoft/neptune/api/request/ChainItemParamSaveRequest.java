package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemDistributionSaveDTOModel;

import java.util.*;

/**
 * itemChainParamSave请求类
 * 商品配送属性新增或修改
 */
public class ChainItemParamSaveRequest implements ApiCloudRequest<PosItemDistributionSaveDTOModel, Void> {

    private PosItemDistributionSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.item.param.save";
    }

    @Override
    public PosItemDistributionSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemDistributionSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
