package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLabelFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemLabelDTOModel;

import com.nhsoft.neptune.api.domain.PosItemLabelDTOModel;

import java.util.*;

/**
 * findPosItemLabel请求类
 * 查询商品档案标签
 */
public class BasicItemlabelFindRequest implements ApiCloudRequest<PosItemLabelFindDTOModel, List<PosItemLabelDTOModel>> {

    private PosItemLabelFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemlabel.find";
    }

    @Override
    public PosItemLabelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLabelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemLabelDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemLabelDTOModel>>>() {};
    }

}
