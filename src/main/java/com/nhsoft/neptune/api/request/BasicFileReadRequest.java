package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FileDTOModel;

import java.util.*;

/**
 * readFile请求类
 * 单据附件读取
 */
public class BasicFileReadRequest implements ApiCloudRequest<String, FileDTOModel> {

    private String bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.file.read";
    }

    @Override
    public String getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(String bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<FileDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<FileDTOModel>>() {};
    }

}
