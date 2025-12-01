package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MercuryCustomerSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.MercuryCustomerDTOModel;

import java.util.*;

/**
 * createMemberMercuryV2请求类
 * 会员新增或修改(包含第三方会员渠道信息)
 */
public class CustomerMercurySavev2Request implements ApiCloudRequest<MercuryCustomerSaveV2DTOModel, MercuryCustomerDTOModel> {

    private MercuryCustomerSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.mercury.save/v2";
    }

    @Override
    public MercuryCustomerSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MercuryCustomerSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MercuryCustomerDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MercuryCustomerDTOModel>>() {};
    }

}
