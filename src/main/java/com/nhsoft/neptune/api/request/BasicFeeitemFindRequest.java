package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.BasicFeeItemDTOModel;

import com.nhsoft.neptune.api.domain.BasicFeeItemDTOModel;

import java.util.*;

/**
 * findBasicFeeItem请求类
 * 费用项目查询
 */
public class BasicFeeitemFindRequest implements ApiCloudRequest<Void, List<BasicFeeItemDTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.feeitem.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicFeeItemDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicFeeItemDTOModel>>>() {};
    }

}
