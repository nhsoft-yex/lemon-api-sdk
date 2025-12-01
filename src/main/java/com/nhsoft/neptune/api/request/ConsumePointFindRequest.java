package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ConsumePointFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ConsumePointFindResV2DTOModel;

import com.nhsoft.neptune.api.domain.ConsumePointFindResV2DTOModel;

import java.util.*;

/**
 * findConsumPoint请求类
 * 积分消费查询
 */
public class ConsumePointFindRequest implements ApiCloudRequest<ConsumePointFindDTOModel, List<ConsumePointFindResV2DTOModel>> {

    private ConsumePointFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.consume.point.find";
    }

    @Override
    public ConsumePointFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ConsumePointFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ConsumePointFindResV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ConsumePointFindResV2DTOModel>>>() {};
    }

}
