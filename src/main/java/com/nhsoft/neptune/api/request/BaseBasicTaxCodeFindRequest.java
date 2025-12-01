package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TaxCodeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TaxCodeVOModel;

import com.nhsoft.neptune.api.domain.TaxCodeVOModel;

import java.util.*;

/**
 * page请求类
 * 税收编码查询
 */
public class BaseBasicTaxCodeFindRequest implements ApiCloudRequest<TaxCodeFindDTOModel, List<TaxCodeVOModel>> {

    private TaxCodeFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.tax.code.find";
    }

    @Override
    public TaxCodeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TaxCodeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TaxCodeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TaxCodeVOModel>>>() {};
    }

}
