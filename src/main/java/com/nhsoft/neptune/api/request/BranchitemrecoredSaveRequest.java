package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchItemRecordUpdateDTOModel;

import java.util.*;

/**
 * save_17请求类
 * 新增单据商品的生产日期
 */
public class BranchitemrecoredSaveRequest implements ApiCloudRequest<BranchItemRecordUpdateDTOModel, Object> {

    private BranchItemRecordUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branchitemrecored.save";
    }

    @Override
    public BranchItemRecordUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchItemRecordUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
