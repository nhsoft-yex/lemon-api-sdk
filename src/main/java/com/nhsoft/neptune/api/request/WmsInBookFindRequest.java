package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsInBookFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsInBookVOModel;

import com.nhsoft.neptune.api.domain.WmsInBookVOModel;

import java.util.*;

/**
 * find_9请求类
 * 入库订单查询
 */
public class WmsInBookFindRequest implements ApiCloudRequest<WmsInBookFindDTOModel, List<WmsInBookVOModel>> {

    private WmsInBookFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.in.book.find";
    }

    @Override
    public WmsInBookFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsInBookFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsInBookVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsInBookVOModel>>>() {};
    }

}
