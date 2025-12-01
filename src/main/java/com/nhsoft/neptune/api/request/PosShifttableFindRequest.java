package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ShiftTableFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ShiftTableVOModel;

import com.nhsoft.neptune.api.domain.ShiftTableVOModel;

import java.util.*;

/**
 * findShiftTable请求类
 * 班次查询
 */
public class PosShifttableFindRequest implements ApiCloudRequest<ShiftTableFindDTOModel, List<ShiftTableVOModel>> {

    private ShiftTableFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.shifttable.find";
    }

    @Override
    public ShiftTableFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ShiftTableFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ShiftTableVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ShiftTableVOModel>>>() {};
    }

}
