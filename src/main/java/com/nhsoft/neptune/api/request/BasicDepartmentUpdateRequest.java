package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DepartmentSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.DepartmentSaveV2DTOModel;

import java.util.*;

/**
 * departmentUpdate请求类
 * 商品部门修改
 */
public class BasicDepartmentUpdateRequest implements ApiCloudRequest<DepartmentSaveV2DTOModel, DepartmentSaveV2DTOModel> {

    private DepartmentSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.department.update";
    }

    @Override
    public DepartmentSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DepartmentSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DepartmentSaveV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DepartmentSaveV2DTOModel>>() {};
    }

}
