package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RegionUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.RegionV2DTOModel;

import java.util.*;

/**
 * regionUpdate请求类
 * 门店区域修改
 */
public class BasicRegionUpdateRequest implements ApiCloudRequest<RegionUpdateV2DTOModel, RegionV2DTOModel> {

    private RegionUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.region.update";
    }

    @Override
    public RegionUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RegionUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RegionV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RegionV2DTOModel>>() {};
    }

}
