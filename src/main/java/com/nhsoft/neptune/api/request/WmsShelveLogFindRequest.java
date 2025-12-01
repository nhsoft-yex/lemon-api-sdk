package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ShelvesLogFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ShelveLogVOModel;

import com.nhsoft.neptune.api.domain.ShelveLogVOModel;

import java.util.*;

/**
 * find_2请求类
 * 上架记录查询
 */
public class WmsShelveLogFindRequest implements ApiCloudRequest<ShelvesLogFindDTOModel, List<ShelveLogVOModel>> {

    private ShelvesLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.shelve.log.find";
    }

    @Override
    public ShelvesLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ShelvesLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ShelveLogVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ShelveLogVOModel>>>() {};
    }

}
