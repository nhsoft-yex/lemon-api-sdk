package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransportLineFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransportLineVOModel;

import com.nhsoft.neptune.api.domain.TransportLineVOModel;

import java.util.*;

/**
 * findTransportLine请求类
 * 查询要货门店波次线路信息
 */
public class WmsTransportLineFindRequest implements ApiCloudRequest<TransportLineFindDTOModel, List<TransportLineVOModel>> {

    private TransportLineFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.transport.line.find";
    }

    @Override
    public TransportLineFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransportLineFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransportLineVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransportLineVOModel>>>() {};
    }

}
