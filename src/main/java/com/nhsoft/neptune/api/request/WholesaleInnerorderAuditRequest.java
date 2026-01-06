package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleInnerOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleInnerOrderVOModel;

import java.util.*;

/**
 * audit_3请求类
 * 售后申请单审核
 */
public class WholesaleInnerorderAuditRequest implements ApiCloudRequest<WholesaleInnerOrderUpdateDTOModel, WholesaleInnerOrderVOModel> {

    private WholesaleInnerOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.innerorder.audit";
    }

    @Override
    public WholesaleInnerOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleInnerOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>>() {};
    }

}
