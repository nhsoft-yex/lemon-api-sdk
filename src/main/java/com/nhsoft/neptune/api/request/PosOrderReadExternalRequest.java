package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderReadByExternalNoDTOModel;

import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import java.util.*;

/**
 * readPosOrderByExternal请求类
 * 销售单据读取(外部单号)
 */
public class PosOrderReadExternalRequest implements ApiCloudRequest<PosOrderReadByExternalNoDTOModel, PosOrderVOModel> {

    private PosOrderReadByExternalNoDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.read.external";
    }

    @Override
    public PosOrderReadByExternalNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderReadByExternalNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosOrderVOModel>>() {};
    }

}
