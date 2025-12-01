package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutSummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsOutSummaryVOModel;

import com.nhsoft.neptune.api.domain.WmsOutSummaryVOModel;

import java.util.*;

/**
 * findSummary_1请求类
 * 出库明细查询
 */
public class WmsOutSummaryFindRequest implements ApiCloudRequest<WmsOutSummaryFindDTOModel, List<WmsOutSummaryVOModel>> {

    private WmsOutSummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.summary.find";
    }

    @Override
    public WmsOutSummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutSummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsOutSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsOutSummaryVOModel>>>() {};
    }

}
