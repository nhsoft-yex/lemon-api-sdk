package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicItemUnitGroupSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicItemUnitGroupDTOModel;

import com.nhsoft.neptune.api.domain.BasicItemUnitGroupDTOModel;

import java.util.*;

/**
 * updateItemUnitGroup请求类
 * 商品计量单位更新
 */
public class BasicItemUnitUpdateRequest implements ApiCloudRequest<BasicItemUnitGroupSaveDTOModel, List<BasicItemUnitGroupDTOModel>> {

    private BasicItemUnitGroupSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.unit.update";
    }

    @Override
    public BasicItemUnitGroupSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicItemUnitGroupSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicItemUnitGroupDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicItemUnitGroupDTOModel>>>() {};
    }

}
