package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PartnerGroupUpdateDTOModel;

import java.util.*;

/**
 * updatePartnerGroup请求类
 * 合作伙伴分组修改
 */
public class UsercenterBasicPartnergroupUpdateRequest implements ApiCloudRequest<PartnerGroupUpdateDTOModel, Object> {

    private PartnerGroupUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partnergroup.update";
    }

    @Override
    public PartnerGroupUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PartnerGroupUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
