package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PayTypeV2DTOModel;

import com.nhsoft.neptune.api.domain.PayTypeV2DTOModel;

import java.util.*;

/**
 * paytypeFind请求类
 * 支付方式查询
 */
public class BasicPaytypeFindRequest implements ApiCloudRequest<Void, List<PayTypeV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.paytype.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PayTypeV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PayTypeV2DTOModel>>>() {};
    }

}
