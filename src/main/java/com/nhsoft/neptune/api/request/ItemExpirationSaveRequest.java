package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemExpirationSaveDTOModel;

import java.util.*;

/**
 * savePosItemExpiration请求类
 * 保质期管理增加商品
 */
public class ItemExpirationSaveRequest implements ApiCloudRequest<PosItemExpirationSaveDTOModel, Void> {

    private PosItemExpirationSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.item.expiration.save";
    }

    @Override
    public PosItemExpirationSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemExpirationSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
