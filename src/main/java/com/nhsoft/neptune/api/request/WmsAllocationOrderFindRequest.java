package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationOrderDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AllocationOrderDetailVOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderDetailVOModel;

import java.util.*;

/**
 * find_13请求类
 * 移库明细查询
 */
public class WmsAllocationOrderFindRequest implements ApiCloudRequest<AllocationOrderDetailFindDTOModel, List<AllocationOrderDetailVOModel>> {

    private AllocationOrderDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.allocation.order.find";
    }

    @Override
    public AllocationOrderDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationOrderDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AllocationOrderDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AllocationOrderDetailVOModel>>>() {};
    }

}
