package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicFeeItemSaveDTOModel;

import com.nhsoft.neptune.api.domain.BasicFeeItemDTOModel;

import java.util.*;

/**
 * saveBasicFeeItem请求类
 * 费用项目新增
 */
public class BasicFeeitemSaveRequest implements ApiCloudRequest<BasicFeeItemSaveDTOModel, BasicFeeItemDTOModel> {

    private BasicFeeItemSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.feeitem.save";
    }

    @Override
    public BasicFeeItemSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicFeeItemSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasicFeeItemDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasicFeeItemDTOModel>>() {};
    }

}
