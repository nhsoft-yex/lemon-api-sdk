package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CreatedReceiptCountReadDTOModel;

import java.util.*;

/**
 * countCreatedReceiptIn45Day请求类
 * 查询45天内制单状态下资金归集的收款单笔数
 */
public class FundReceiptOrderCountcreateandallpayRequest implements ApiCloudRequest<CreatedReceiptCountReadDTOModel, Integer> {

    private CreatedReceiptCountReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.countcreateandallpay";
    }

    @Override
    public CreatedReceiptCountReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CreatedReceiptCountReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Integer>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Integer>>() {};
    }

}
