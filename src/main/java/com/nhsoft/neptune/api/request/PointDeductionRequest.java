package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ConsumePointV2DTOModel;

import java.util.*;

/**
 * reduceCardPointOnline请求类
 * 积分扣减
 */
public class PointDeductionRequest implements ApiCloudRequest<ConsumePointV2DTOModel, Void> {

    private ConsumePointV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.deduction";
    }

    @Override
    public ConsumePointV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ConsumePointV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
