package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsReturnOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WmsReturnOrderVOModel;

import java.util.*;

/**
 * read_1请求类
 * 销退订单新增并审核
 */
public class WmsReturnOrderSaveandauditRequest implements ApiCloudRequest<WmsReturnOrderSaveDTOModel, WmsReturnOrderVOModel> {

    private WmsReturnOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.return.order.saveandaudit";
    }

    @Override
    public WmsReturnOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsReturnOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsReturnOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsReturnOrderVOModel>>() {};
    }

}
