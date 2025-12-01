package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicItemListDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicVariantVOModel;

import com.nhsoft.neptune.api.domain.BasicVariantVOModel;

import java.util.*;

/**
 * findItemVariantList请求类
 * 商城商品规格查询
 */
public class MercuryBasicItemVariantListRequest implements ApiCloudRequest<BasicItemListDTOModel, List<BasicVariantVOModel>> {

    private BasicItemListDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.item.variant.list";
    }

    @Override
    public BasicItemListDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicItemListDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicVariantVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicVariantVOModel>>>() {};
    }

}
