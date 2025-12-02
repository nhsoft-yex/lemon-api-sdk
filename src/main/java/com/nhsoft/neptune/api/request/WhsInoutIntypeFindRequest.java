package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.WhsInOutInTypeVOModel;

import com.nhsoft.neptune.api.domain.WhsInOutInTypeVOModel;

import java.util.*;

/**
 * find_24请求类
 * 批发收入类型查询
 */
public class WhsInoutIntypeFindRequest implements ApiCloudRequest<Void, List<WhsInOutInTypeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.inout.intype.find";
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
    public TypeReference<ApiCloudResponse<List<WhsInOutInTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsInOutInTypeVOModel>>>() {};
    }

}
