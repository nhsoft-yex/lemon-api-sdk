package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MercuryCustomerSaveDTOModel;

import com.nhsoft.neptune.api.domain.MercuryCustomerDTOModel;

import java.util.*;

/**
 * createMemberMercury请求类
 * 会员新增或修改(包含第三方会员渠道信息)
 */
public class CustomerMercurySaveRequest implements ApiCloudRequest<MercuryCustomerSaveDTOModel, MercuryCustomerDTOModel> {

    private MercuryCustomerSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.mercury.save";
    }

    @Override
    public MercuryCustomerSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MercuryCustomerSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MercuryCustomerDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MercuryCustomerDTOModel>>() {};
    }

}
