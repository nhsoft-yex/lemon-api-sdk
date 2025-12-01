package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLabelSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosItemLabelDTOModel;

import java.util.*;

/**
 * savePosItemLabel请求类
 * 新增商品档案标签
 */
public class BasicItemlabelSaveRequest implements ApiCloudRequest<PosItemLabelSaveDTOModel, PosItemLabelDTOModel> {

    private PosItemLabelSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemlabel.save";
    }

    @Override
    public PosItemLabelSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLabelSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemLabelDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemLabelDTOModel>>() {};
    }

}
