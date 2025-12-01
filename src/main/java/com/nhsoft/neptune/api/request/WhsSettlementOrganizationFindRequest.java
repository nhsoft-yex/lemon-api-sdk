package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsSettlementOrganizationFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsSettlementOrganizationVOModel;

import com.nhsoft.neptune.api.domain.WhsSettlementOrganizationVOModel;

import java.util.*;

/**
 * find_14请求类
 * 批发结算组织查询
 */
public class WhsSettlementOrganizationFindRequest implements ApiCloudRequest<WhsSettlementOrganizationFindDTOModel, List<WhsSettlementOrganizationVOModel>> {

    private WhsSettlementOrganizationFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.settlement.organization.find";
    }

    @Override
    public WhsSettlementOrganizationFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsSettlementOrganizationFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsSettlementOrganizationVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsSettlementOrganizationVOModel>>>() {};
    }

}
