package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.RegionV2DTOModel;

import com.nhsoft.neptune.api.domain.RegionV2DTOModel;

import java.util.*;

/**
 * regionFind请求类
 * 门店区域查询
 */
public class BasicRegionFindRequest implements ApiCloudRequest<Void, List<RegionV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.region.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<RegionV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RegionV2DTOModel>>>() {};
    }

}
