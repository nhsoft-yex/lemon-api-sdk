package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderUpdateExtendDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderUpdate_1请求类
 * 批发销售单修改扩展属性
 */
public class WholesaleOrderUpdateExtentdRequest implements ApiCloudRequest<WholesaleOrderUpdateExtendDTOModel, WholesaleOrderVOModel> {

    private WholesaleOrderUpdateExtendDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.update.extentd";
    }

    @Override
    public WholesaleOrderUpdateExtendDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderUpdateExtendDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleOrderVOModel>>() {};
    }

}
