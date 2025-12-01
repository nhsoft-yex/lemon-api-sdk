package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientGradePriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientGradeItemVOModel;

import com.nhsoft.neptune.api.domain.ClientGradeItemVOModel;

import java.util.*;

/**
 * clientLevelPriceFind请求类
 * 客户等级价格查询
 */
public class BasicClientlevelPriceFindRequest implements ApiCloudRequest<ClientGradePriceFindDTOModel, List<ClientGradeItemVOModel>> {

    private ClientGradePriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientlevel.price.find";
    }

    @Override
    public ClientGradePriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientGradePriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientGradeItemVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientGradeItemVOModel>>>() {};
    }

}
