package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FileFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.FileDTOModel;

import com.nhsoft.neptune.api.domain.FileDTOModel;

import java.util.*;

/**
 * findFile_1请求类
 * 单据附件查询
 */
public class BasicFileFindRequest implements ApiCloudRequest<FileFindDTOModel, List<FileDTOModel>> {

    private FileFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.file.find";
    }

    @Override
    public FileFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FileFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<FileDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<FileDTOModel>>>() {};
    }

}
