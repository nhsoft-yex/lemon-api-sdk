package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemDistributionFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemDistributionDTOModel;

import com.nhsoft.neptune.api.domain.PosItemDistributionDTOModel;

import java.util.*;

/**
 * itemChainParamFind请求类
 * 商品配送属性查询
 */
public class ChainItemParamFindRequest implements ApiCloudRequest<PosItemDistributionFindDTOModel, List<PosItemDistributionDTOModel>> {

    private PosItemDistributionFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.item.param.find";
    }

    @Override
    public PosItemDistributionFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemDistributionFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemDistributionDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemDistributionDTOModel>>>() {};
    }

}
