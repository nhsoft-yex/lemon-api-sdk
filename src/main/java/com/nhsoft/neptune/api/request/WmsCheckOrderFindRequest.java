package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsCheckOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsCheckOrderVOModel;

import com.nhsoft.neptune.api.domain.WmsCheckOrderVOModel;

import java.util.*;

/**
 * find_12请求类
 * 盘点单查询
 */
public class WmsCheckOrderFindRequest implements ApiCloudRequest<WmsCheckOrderFindDTOModel, List<WmsCheckOrderVOModel>> {

    private WmsCheckOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.order.find";
    }

    @Override
    public WmsCheckOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsCheckOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsCheckOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsCheckOrderVOModel>>>() {};
    }

}
