package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.BasicItemUnitGroupDTOModel;

import com.nhsoft.neptune.api.domain.BasicItemUnitGroupDTOModel;

import java.util.*;

/**
 * findItemUnitGroup请求类
 * 商品计量单位查询
 */
public class BasicItemUnitFindRequest implements ApiCloudRequest<Void, List<BasicItemUnitGroupDTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.unit.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicItemUnitGroupDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicItemUnitGroupDTOModel>>>() {};
    }

}
