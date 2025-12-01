package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayLogExcelGenerateDTOModel;

import java.util.*;

/**
 * generatePaylogExcel请求类
 * 支付日志文件生成
 */
public class AllpayBasicPaylogGenerateRequest implements ApiCloudRequest<PayLogExcelGenerateDTOModel, Object> {

    private PayLogExcelGenerateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.paylog.generate";
    }

    @Override
    public PayLogExcelGenerateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayLogExcelGenerateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
