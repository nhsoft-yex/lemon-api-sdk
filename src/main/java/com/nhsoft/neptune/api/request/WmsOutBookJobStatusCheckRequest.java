package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookCheckJobFinishedDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsOutBookCheckJobFinishedResultVOModel;

import com.nhsoft.neptune.api.domain.WmsOutBookCheckJobFinishedResultVOModel;

import java.util.*;

/**
 * checkJobFinished请求类
 * 出库订单校验
 */
public class WmsOutBookJobStatusCheckRequest implements ApiCloudRequest<WmsOutBookCheckJobFinishedDTOModel, List<WmsOutBookCheckJobFinishedResultVOModel>> {

    private WmsOutBookCheckJobFinishedDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.job.status.check";
    }

    @Override
    public WmsOutBookCheckJobFinishedDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutBookCheckJobFinishedDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsOutBookCheckJobFinishedResultVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsOutBookCheckJobFinishedResultVOModel>>>() {};
    }

}
