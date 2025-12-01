package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsReturnOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WmsReturnOrderVOModel;

import java.util.*;

/**
 * read_12请求类
 * 销退订单读取
 */
public class WmsReturnOrderReadRequest implements ApiCloudRequest<WmsReturnOrderReadDTOModel, WmsReturnOrderVOModel> {

    private WmsReturnOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.return.order.read";
    }

    @Override
    public WmsReturnOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsReturnOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsReturnOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsReturnOrderVOModel>>() {};
    }

}
