package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PointConvertDeleteDTOModel;

import java.util.*;

/**
 * deletePointConvert请求类
 * 积分兑换物删除
 */
public class PointConvertDeleteRequest implements ApiCloudRequest<PointConvertDeleteDTOModel, Void> {

    private PointConvertDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.convert.delete";
    }

    @Override
    public PointConvertDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PointConvertDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
