package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicFeeItemDeleteDTOModel;

import com.nhsoft.neptune.api.domain.BasicFeeItemDTOModel;

import java.util.*;

/**
 * deleteBasicFeeItem请求类
 * 费用项目删除
 */
public class BasicFeeitemDeleteRequest implements ApiCloudRequest<BasicFeeItemDeleteDTOModel, BasicFeeItemDTOModel> {

    private BasicFeeItemDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.feeitem.delete";
    }

    @Override
    public BasicFeeItemDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicFeeItemDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasicFeeItemDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasicFeeItemDTOModel>>() {};
    }

}
