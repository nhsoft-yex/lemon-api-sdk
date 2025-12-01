package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPriceFindByClientDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsPriceVOModel;

import com.nhsoft.neptune.api.domain.WhsPriceVOModel;

import java.util.*;

/**
 * save_5请求类
 * 根据客户查询批发价
 */
public class WholesalePriceFindbyclientfidRequest implements ApiCloudRequest<WhsPriceFindByClientDTOModel, List<WhsPriceVOModel>> {

    private WhsPriceFindByClientDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.price.findbyclientfid";
    }

    @Override
    public WhsPriceFindByClientDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPriceFindByClientDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsPriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsPriceVOModel>>>() {};
    }

}
