package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsInBookReadDTOModel;

import com.nhsoft.neptune.api.domain.WmsInBookVOModel;

import java.util.*;

/**
 * read_16请求类
 * 入库订单读取
 */
public class WmsInBookReadRequest implements ApiCloudRequest<WmsInBookReadDTOModel, WmsInBookVOModel> {

    private WmsInBookReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.in.book.read";
    }

    @Override
    public WmsInBookReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsInBookReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsInBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsInBookVOModel>>() {};
    }

}
