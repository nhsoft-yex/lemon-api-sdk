package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RetailPosLogFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.RetailPosLogDTOModel;

import com.nhsoft.neptune.api.domain.RetailPosLogDTOModel;

import java.util.*;

/**
 * findRetailPosLog请求类
 * 收银异常监控记录查询
 */
public class PosLogRetailFindRequest implements ApiCloudRequest<RetailPosLogFindDTOModel, List<RetailPosLogDTOModel>> {

    private RetailPosLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.log.retail.find";
    }

    @Override
    public RetailPosLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RetailPosLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<RetailPosLogDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RetailPosLogDTOModel>>>() {};
    }

}
