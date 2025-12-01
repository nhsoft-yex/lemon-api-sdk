package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemExpirationDeleteDTOModel;

import java.util.*;

/**
 * deletePosItemExpiration请求类
 * 保质期管理删除商品
 */
public class ItemExpirationDeleteRequest implements ApiCloudRequest<PosItemExpirationDeleteDTOModel, Void> {

    private PosItemExpirationDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.item.expiration.delete";
    }

    @Override
    public PosItemExpirationDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemExpirationDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
