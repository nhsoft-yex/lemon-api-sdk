package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsOtherInComeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsOtherInComeVOModel;

import com.nhsoft.neptune.api.domain.WhsOtherInComeVOModel;

import java.util.*;

/**
 * find_15请求类
 * 批发其他收入单查询
 */
public class WhsOtherIncomeFindRequest implements ApiCloudRequest<WhsOtherInComeFindDTOModel, List<WhsOtherInComeVOModel>> {

    private WhsOtherInComeFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.other.income.find";
    }

    @Override
    public WhsOtherInComeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsOtherInComeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsOtherInComeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsOtherInComeVOModel>>>() {};
    }

}
