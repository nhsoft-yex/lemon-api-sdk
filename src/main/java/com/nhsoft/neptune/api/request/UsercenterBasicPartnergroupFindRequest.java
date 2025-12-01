package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PartnerGroupFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PartnerGroupVOModel;

import com.nhsoft.neptune.api.domain.PartnerGroupVOModel;

import java.util.*;

/**
 * findPartnerGroup请求类
 * 合作伙伴分组查询
 */
public class UsercenterBasicPartnergroupFindRequest implements ApiCloudRequest<PartnerGroupFindDTOModel, List<PartnerGroupVOModel>> {

    private PartnerGroupFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partnergroup.find";
    }

    @Override
    public PartnerGroupFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PartnerGroupFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PartnerGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PartnerGroupVOModel>>>() {};
    }

}
