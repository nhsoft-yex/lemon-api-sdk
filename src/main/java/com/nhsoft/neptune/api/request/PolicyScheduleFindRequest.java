package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyScheduleFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyScheduleVOModel;

import com.nhsoft.neptune.api.domain.PolicyScheduleVOModel;

import java.util.*;

/**
 * findPolicySchedule请求类
 * 促销档期查询
 */
public class PolicyScheduleFindRequest implements ApiCloudRequest<PolicyScheduleFindDTOModel, List<PolicyScheduleVOModel>> {

    private PolicyScheduleFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.schedule.find";
    }

    @Override
    public PolicyScheduleFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyScheduleFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PolicyScheduleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyScheduleVOModel>>>() {};
    }

}
