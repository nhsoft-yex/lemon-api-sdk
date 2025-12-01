package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsOutBookVOModel;

import com.nhsoft.neptune.api.domain.WmsOutBookVOModel;

import java.util.*;

/**
 * find_6请求类
 * 出库订单查询
 */
public class WmsOutBookFindRequest implements ApiCloudRequest<WmsOutBookFindDTOModel, List<WmsOutBookVOModel>> {

    private WmsOutBookFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.find";
    }

    @Override
    public WmsOutBookFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutBookFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsOutBookVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsOutBookVOModel>>>() {};
    }

}
