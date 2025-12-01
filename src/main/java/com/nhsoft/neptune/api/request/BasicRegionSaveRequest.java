package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RegionSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.RegionV2DTOModel;

import java.util.*;

/**
 * regionSave请求类
 * 门店区域新增
 */
public class BasicRegionSaveRequest implements ApiCloudRequest<RegionSaveV2DTOModel, RegionV2DTOModel> {

    private RegionSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.region.save";
    }

    @Override
    public RegionSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RegionSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RegionV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RegionV2DTOModel>>() {};
    }

}
