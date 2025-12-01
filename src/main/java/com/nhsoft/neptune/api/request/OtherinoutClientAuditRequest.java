package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientOtherInoutAuditDTOModel;

import com.nhsoft.neptune.api.domain.ClientOtherInoutDTOModel;

import java.util.*;

/**
 * clientOtherInoutAudit请求类
 * 客户费用单审核
 */
public class OtherinoutClientAuditRequest implements ApiCloudRequest<ClientOtherInoutAuditDTOModel, ClientOtherInoutDTOModel> {

    private ClientOtherInoutAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.client.audit";
    }

    @Override
    public ClientOtherInoutAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientOtherInoutAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientOtherInoutDTOModel>>() {};
    }

}
