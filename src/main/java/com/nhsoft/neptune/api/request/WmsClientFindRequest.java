package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsClientFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsClientVOModel;

import com.nhsoft.neptune.api.domain.WmsClientVOModel;

import java.util.*;

/**
 * read_5请求类
 * wms客户查询
 */
public class WmsClientFindRequest implements ApiCloudRequest<WmsClientFindDTOModel, List<WmsClientVOModel>> {

    private WmsClientFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.client.find";
    }

    @Override
    public WmsClientFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsClientFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsClientVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsClientVOModel>>>() {};
    }

}
