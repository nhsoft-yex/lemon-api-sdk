package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FileDeleteDTOModel;

import java.util.*;

/**
 * deleteFile请求类
 * 单据附件删除
 */
public class BasicFileDeleteRequest implements ApiCloudRequest<FileDeleteDTOModel, Void> {

    private FileDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.file.delete";
    }

    @Override
    public FileDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FileDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
