package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WarehouseSummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WarehouseSummaryVOModel;

import com.nhsoft.neptune.api.domain.WarehouseSummaryVOModel;

import java.util.*;

/**
 * findSummary请求类
 * 入库明细查询
 */
public class WmsWarehouseSummaryFindRequest implements ApiCloudRequest<WarehouseSummaryFindDTOModel, List<WarehouseSummaryVOModel>> {

    private WarehouseSummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.warehouse.summary.find";
    }

    @Override
    public WarehouseSummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WarehouseSummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WarehouseSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WarehouseSummaryVOModel>>>() {};
    }

}
