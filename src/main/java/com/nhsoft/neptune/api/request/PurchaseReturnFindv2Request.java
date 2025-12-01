package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import java.util.*;

/**
 * returnFindV2请求类
 * 退货单查询
 */
public class PurchaseReturnFindv2Request implements ApiCloudRequest<ReturnFindV3DTOModel, List<ReturnOrderV2DTOModel>> {

    private ReturnFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.find/v2";
    }

    @Override
    public ReturnFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReturnOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReturnOrderV2DTOModel>>>() {};
    }

}
