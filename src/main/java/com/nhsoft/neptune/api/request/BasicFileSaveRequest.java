package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FileSaveDTOModel;

import com.nhsoft.neptune.api.domain.FileDTOModel;

import java.util.*;

/**
 * findFile请求类
 * 单据附件新增
 */
public class BasicFileSaveRequest implements ApiCloudRequest<FileSaveDTOModel, FileDTOModel> {

    private FileSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.file.save";
    }

    @Override
    public FileSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FileSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<FileDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<FileDTOModel>>() {};
    }

}
