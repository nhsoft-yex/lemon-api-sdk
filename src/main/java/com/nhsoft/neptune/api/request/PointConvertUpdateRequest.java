package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PointConvertSaveDTOModel;

import java.util.*;

/**
 * updatePointConvert请求类
 * 积分兑换物修改
 */
public class PointConvertUpdateRequest implements ApiCloudRequest<PointConvertSaveDTOModel, Void> {

    private PointConvertSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.convert.update";
    }

    @Override
    public PointConvertSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PointConvertSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
