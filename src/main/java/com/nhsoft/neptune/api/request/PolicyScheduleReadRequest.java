package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyScheduleReadDTOModel;

import com.nhsoft.neptune.api.domain.PolicyScheduleVOModel;

import java.util.*;

/**
 * readPolicySchedule请求类
 * 促销档期读取
 */
public class PolicyScheduleReadRequest implements ApiCloudRequest<PolicyScheduleReadDTOModel, PolicyScheduleVOModel> {

    private PolicyScheduleReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.schedule.read";
    }

    @Override
    public PolicyScheduleReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyScheduleReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyScheduleVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyScheduleVOModel>>() {};
    }

}
