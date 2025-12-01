package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleOrderUploadDTOModel;

import java.util.*;

/**
 * uploadSale请求类
 * 第三方销售单上传
 */
public class OmsSaleorderUploadRequest implements ApiCloudRequest<SaleOrderUploadDTOModel, Object> {

    private SaleOrderUploadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.oms.saleorder.upload";
    }

    @Override
    public SaleOrderUploadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleOrderUploadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
