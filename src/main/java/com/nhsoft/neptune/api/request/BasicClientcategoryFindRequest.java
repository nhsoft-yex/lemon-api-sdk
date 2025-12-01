package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PosClientTypeVOModel;

import com.nhsoft.neptune.api.domain.PosClientTypeVOModel;

import java.util.*;

/**
 * clientCategoryFind请求类
 * 客户类别查询
 */
public class BasicClientcategoryFindRequest implements ApiCloudRequest<Void, List<PosClientTypeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientcategory.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosClientTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosClientTypeVOModel>>>() {};
    }

}
