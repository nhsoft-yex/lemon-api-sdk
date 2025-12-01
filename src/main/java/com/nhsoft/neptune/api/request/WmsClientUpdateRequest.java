package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsClientUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WmsClientVOModel;

import java.util.*;

/**
 * update_4请求类
 * wms客户修改
 */
public class WmsClientUpdateRequest implements ApiCloudRequest<WmsClientUpdateDTOModel, WmsClientVOModel> {

    private WmsClientUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.client.update";
    }

    @Override
    public WmsClientUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsClientUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsClientVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsClientVOModel>>() {};
    }

}
