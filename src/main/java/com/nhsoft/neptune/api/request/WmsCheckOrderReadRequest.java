package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsCheckOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WmsCheckOrderVOModel;

import java.util.*;

/**
 * read_18请求类
 * 盘点单读取
 */
public class WmsCheckOrderReadRequest implements ApiCloudRequest<WmsCheckOrderReadDTOModel, WmsCheckOrderVOModel> {

    private WmsCheckOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.order.read";
    }

    @Override
    public WmsCheckOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsCheckOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsCheckOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsCheckOrderVOModel>>() {};
    }

}
