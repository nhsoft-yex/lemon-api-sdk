package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardCategoryVOModel;

import com.nhsoft.neptune.api.domain.GiftCardCategoryVOModel;

import java.util.*;

/**
 * findGiftCardCategory请求类
 * 查询所有礼品卡分组
 */
public class CustomerGiftcardCategoryFindRequest implements ApiCloudRequest<Void, List<GiftCardCategoryVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.category.find";
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
    public TypeReference<ApiCloudResponse<List<GiftCardCategoryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardCategoryVOModel>>>() {};
    }

}
