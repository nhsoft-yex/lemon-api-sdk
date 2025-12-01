package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.FileSaveDTOModel;

import com.nhsoft.neptune.api.domain.FileSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.FileDTOModel;

import com.nhsoft.neptune.api.domain.FileDTOModel;

import java.util.*;

/**
 * batchSaveFile请求类
 * 单据附件批量保存
 */
public class BasicFileBatchSaveRequest implements ApiCloudRequest<List<FileSaveDTOModel>, List<FileDTOModel>> {

    private List<FileSaveDTOModel> bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.file.batch.save";
    }

    @Override
    public List<FileSaveDTOModel> getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(List<FileSaveDTOModel> bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<FileDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<FileDTOModel>>>() {};
    }

}
