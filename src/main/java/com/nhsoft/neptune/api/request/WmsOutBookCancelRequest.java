package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookReadDTOModel;

import java.util.*;

/**
 * cancel_1请求类
 * 出库订单作废
 */
public class WmsOutBookCancelRequest implements ApiCloudRequest<WmsOutBookReadDTOModel, Void> {

    private WmsOutBookReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.cancel";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
