package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyScheduleFindByIdsDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyScheduleVOModel;

import com.nhsoft.neptune.api.domain.PolicyScheduleVOModel;

import java.util.*;

/**
 * findPolicyScheduleByIds请求类
 * 促销档期根据促销档期编号批量查询
 */
public class PolicyScheduleFindbyidsRequest implements ApiCloudRequest<PolicyScheduleFindByIdsDTOModel, List<PolicyScheduleVOModel>> {

    private PolicyScheduleFindByIdsDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.schedule.findbyids";
    }

    @Override
    public PolicyScheduleFindByIdsDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyScheduleFindByIdsDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PolicyScheduleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyScheduleVOModel>>>() {};
    }

}
