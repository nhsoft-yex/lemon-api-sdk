package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsOutOrderVOModel;

import com.nhsoft.neptune.api.domain.WmsOutOrderVOModel;

import java.util.*;

/**
 * read_3请求类
 * 出库单查询
 */
public class WmsOutOrderFindRequest implements ApiCloudRequest<WmsOutOrderFindDTOModel, List<WmsOutOrderVOModel>> {

    private WmsOutOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.order.find";
    }

    @Override
    public WmsOutOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsOutOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsOutOrderVOModel>>>() {};
    }

}
