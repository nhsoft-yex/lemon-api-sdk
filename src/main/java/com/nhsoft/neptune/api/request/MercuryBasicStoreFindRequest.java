package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicStoreFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicStoreVOModel;

import com.nhsoft.neptune.api.domain.BasicStoreVOModel;

import java.util.*;

/**
 * findStore请求类
 * 商城门店查询
 */
public class MercuryBasicStoreFindRequest implements ApiCloudRequest<BasicStoreFindDTOModel, List<BasicStoreVOModel>> {

    private BasicStoreFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.store.find";
    }

    @Override
    public BasicStoreFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicStoreFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicStoreVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicStoreVOModel>>>() {};
    }

}
