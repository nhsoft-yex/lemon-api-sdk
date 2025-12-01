package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PosClientGradeVOModel;

import com.nhsoft.neptune.api.domain.PosClientGradeVOModel;

import java.util.*;

/**
 * clientLevelFind请求类
 * 客户等级查询
 */
public class BasicClientlevelFindRequest implements ApiCloudRequest<Void, List<PosClientGradeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientlevel.find";
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
    public TypeReference<ApiCloudResponse<List<PosClientGradeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosClientGradeVOModel>>>() {};
    }

}
