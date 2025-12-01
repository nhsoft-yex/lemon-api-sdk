package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DepartmentDeleteDTOModel;

import java.util.*;

/**
 * departmentDelete请求类
 * 商品部门删除
 */
public class BasicDepartmentDeleteRequest implements ApiCloudRequest<DepartmentDeleteDTOModel, Void> {

    private DepartmentDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.department.delete";
    }

    @Override
    public DepartmentDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DepartmentDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
