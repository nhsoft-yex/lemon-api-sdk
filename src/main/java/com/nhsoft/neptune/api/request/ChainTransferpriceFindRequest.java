package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchTransferFeeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchItemTransferPriceDTOModel;

import com.nhsoft.neptune.api.domain.BranchItemTransferPriceDTOModel;

import java.util.*;

/**
 * findItemTransferPrice_1请求类
 * 查询门店配送价
 */
public class ChainTransferpriceFindRequest implements ApiCloudRequest<BranchTransferFeeFindDTOModel, List<BranchItemTransferPriceDTOModel>> {

    private BranchTransferFeeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.transferprice.find";
    }

    @Override
    public BranchTransferFeeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchTransferFeeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchItemTransferPriceDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchItemTransferPriceDTOModel>>>() {};
    }

}
