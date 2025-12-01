package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ShiftTablePaymentFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ShiftTablePaymentVOModel;

import com.nhsoft.neptune.api.domain.ShiftTablePaymentVOModel;

import java.util.*;

/**
 * posOrderPaymentSummary请求类
 * 门店缴款单查询
 */
public class PosBranchPaymentFindRequest implements ApiCloudRequest<ShiftTablePaymentFindDTOModel, List<ShiftTablePaymentVOModel>> {

    private ShiftTablePaymentFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.branch.payment.find";
    }

    @Override
    public ShiftTablePaymentFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ShiftTablePaymentFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ShiftTablePaymentVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ShiftTablePaymentVOModel>>>() {};
    }

}
