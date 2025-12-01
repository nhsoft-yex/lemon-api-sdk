package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsReturnOrderReadDTOModel;

import java.util.*;

/**
 * cancel请求类
 * 销退订单作废
 */
public class WmsReturnOrderCancelRequest implements ApiCloudRequest<WmsReturnOrderReadDTOModel, Void> {

    private WmsReturnOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.return.order.cancel";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
