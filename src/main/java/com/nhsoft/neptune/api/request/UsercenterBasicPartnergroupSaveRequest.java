package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PartnerGroupSaveDTOModel;

import com.nhsoft.neptune.api.domain.PartnerGroupVOModel;

import java.util.*;

/**
 * savePartnerGroup请求类
 * 合作伙伴分组新增
 */
public class UsercenterBasicPartnergroupSaveRequest implements ApiCloudRequest<PartnerGroupSaveDTOModel, PartnerGroupVOModel> {

    private PartnerGroupSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partnergroup.save";
    }

    @Override
    public PartnerGroupSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PartnerGroupSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PartnerGroupVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PartnerGroupVOModel>>() {};
    }

}
