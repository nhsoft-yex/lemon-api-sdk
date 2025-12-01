package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsClientSaveDTOModel;

import com.nhsoft.neptune.api.domain.WmsClientVOModel;

import java.util.*;

/**
 * save_3请求类
 * wms客户新增
 */
public class WmsClientSaveRequest implements ApiCloudRequest<WmsClientSaveDTOModel, WmsClientVOModel> {

    private WmsClientSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.client.save";
    }

    @Override
    public WmsClientSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsClientSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsClientVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsClientVOModel>>() {};
    }

}
