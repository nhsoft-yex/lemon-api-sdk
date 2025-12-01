package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import java.util.*;

/**
 * findPosOrder_1请求类
 * 销售单据查询
 */
public class PosOrderFindRequest implements ApiCloudRequest<PosOrderFindDTOModel, List<PosOrderVOModel>> {

    private PosOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.find";
    }

    @Override
    public PosOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOrderVOModel>>>() {};
    }

}
