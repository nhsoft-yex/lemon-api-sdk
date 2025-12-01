package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosClientVOModel;

import com.nhsoft.neptune.api.domain.PosClientVOModel;

import java.util.*;

/**
 * clientFind请求类
 * 客户查询
 */
public class BasicClientFindRequest implements ApiCloudRequest<PosClientFindDTOModel, List<PosClientVOModel>> {

    private PosClientFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.find";
    }

    @Override
    public PosClientFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosClientVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosClientVOModel>>>() {};
    }

}
