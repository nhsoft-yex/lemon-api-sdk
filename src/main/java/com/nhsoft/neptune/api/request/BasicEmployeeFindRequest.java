package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicEmployeeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicEmployeeDTOModel;

import com.nhsoft.neptune.api.domain.BasicEmployeeDTOModel;

import java.util.*;

/**
 * findEmployees请求类
 * 员工信息查询
 */
public class BasicEmployeeFindRequest implements ApiCloudRequest<BasicEmployeeFindDTOModel, List<BasicEmployeeDTOModel>> {

    private BasicEmployeeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.employee.find";
    }

    @Override
    public BasicEmployeeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicEmployeeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicEmployeeDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicEmployeeDTOModel>>>() {};
    }

}
