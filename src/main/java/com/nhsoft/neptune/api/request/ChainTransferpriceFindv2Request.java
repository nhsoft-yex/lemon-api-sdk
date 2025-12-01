package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemPriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemPriceVOModel;

import com.nhsoft.neptune.api.domain.ItemPriceVOModel;

import java.util.*;

/**
 * findItemTransferPrice请求类
 * 查询门店配送价
 */
public class ChainTransferpriceFindv2Request implements ApiCloudRequest<ItemPriceFindDTOModel, List<ItemPriceVOModel>> {

    private ItemPriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.transferprice.find/v2";
    }

    @Override
    public ItemPriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemPriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemPriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemPriceVOModel>>>() {};
    }

}
