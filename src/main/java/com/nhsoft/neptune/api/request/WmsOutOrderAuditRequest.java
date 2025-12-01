package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutOrderAuditDTOModel;

import java.util.*;

/**
 * audit请求类
 * 出库单审核
 */
public class WmsOutOrderAuditRequest implements ApiCloudRequest<WmsOutOrderAuditDTOModel, Void> {

    private WmsOutOrderAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.order.audit";
    }

    @Override
    public WmsOutOrderAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutOrderAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
