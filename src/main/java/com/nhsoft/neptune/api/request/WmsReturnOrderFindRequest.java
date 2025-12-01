package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsReturnOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsReturnOrderVOModel;

import com.nhsoft.neptune.api.domain.WmsReturnOrderVOModel;

import java.util.*;

/**
 * read_2请求类
 * 销退订单查询
 */
public class WmsReturnOrderFindRequest implements ApiCloudRequest<WmsReturnOrderFindDTOModel, List<WmsReturnOrderVOModel>> {

    private WmsReturnOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.return.order.find";
    }

    @Override
    public WmsReturnOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsReturnOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsReturnOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsReturnOrderVOModel>>>() {};
    }

}
