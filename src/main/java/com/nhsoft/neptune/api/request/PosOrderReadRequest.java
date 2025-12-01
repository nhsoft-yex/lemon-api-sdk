package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import java.util.*;

/**
 * readPosOrder请求类
 * 销售单据读取
 */
public class PosOrderReadRequest implements ApiCloudRequest<PosOrderReadDTOModel, PosOrderVOModel> {

    private PosOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.read";
    }

    @Override
    public PosOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosOrderVOModel>>() {};
    }

}
