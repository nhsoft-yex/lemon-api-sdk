package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.DepartmentV2DTOModel;

import com.nhsoft.neptune.api.domain.DepartmentV2DTOModel;

import java.util.*;

/**
 * departmentFind请求类
 * 商品部门查询
 */
public class BasicDepartmentFindRequest implements ApiCloudRequest<Void, List<DepartmentV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.department.find";
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
    public TypeReference<ApiCloudResponse<List<DepartmentV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<DepartmentV2DTOModel>>>() {};
    }

}
