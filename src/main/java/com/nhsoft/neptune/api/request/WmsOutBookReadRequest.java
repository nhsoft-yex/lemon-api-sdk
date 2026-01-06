package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookReadDTOModel;

import com.nhsoft.neptune.api.domain.WmsOutBookVOModel;

import java.util.*;

/**
 * read_15请求类
 * 出库订单读取
 */
public class WmsOutBookReadRequest implements ApiCloudRequest<WmsOutBookReadDTOModel, WmsOutBookVOModel> {

    private WmsOutBookReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.read";
    }

    @Override
    public WmsOutBookReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutBookReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsOutBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsOutBookVOModel>>() {};
    }

}
