package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RefundOrderUploadDTOModel;

import java.util.*;

/**
 * uploadRefund请求类
 * 第三方退款单上传
 */
public class OmsRefundorderUploadRequest implements ApiCloudRequest<RefundOrderUploadDTOModel, Object> {

    private RefundOrderUploadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.oms.refundorder.upload";
    }

    @Override
    public RefundOrderUploadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RefundOrderUploadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
