package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WmsOutOrderVOModel;

import java.util.*;

/**
 * read_14请求类
 * 出库单读取
 */
public class WmsOutOrderReadRequest implements ApiCloudRequest<WmsOutOrderReadDTOModel, WmsOutOrderVOModel> {

    private WmsOutOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.order.read";
    }

    @Override
    public WmsOutOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsOutOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsOutOrderVOModel>>() {};
    }

}
