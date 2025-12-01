package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import java.util.*;

/**
 * returnFind请求类
 * 退货单查询
 */
public class PurchaseReturnFindRequest implements ApiCloudRequest<ReturnFindV2DTOModel, List<ReturnOrderV2DTOModel>> {

    private ReturnFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.find";
    }

    @Override
    public ReturnFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReturnOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReturnOrderV2DTOModel>>>() {};
    }

}
