package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLabelUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PosItemLabelDTOModel;

import java.util.*;

/**
 * updatePosItemLabel请求类
 * 修改商品档案标签
 */
public class BasicItemlabelUpdateRequest implements ApiCloudRequest<PosItemLabelUpdateDTOModel, PosItemLabelDTOModel> {

    private PosItemLabelUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemlabel.update";
    }

    @Override
    public PosItemLabelUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLabelUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemLabelDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemLabelDTOModel>>() {};
    }

}
