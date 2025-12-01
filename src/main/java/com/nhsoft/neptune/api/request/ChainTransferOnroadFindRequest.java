package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferOnroadFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransferOnroadV2DTOModel;

import com.nhsoft.neptune.api.domain.TransferOnroadV2DTOModel;

import java.util.*;

/**
 * findTransferOnroad请求类
 * 查询配送在途
 */
public class ChainTransferOnroadFindRequest implements ApiCloudRequest<TransferOnroadFindV2DTOModel, List<TransferOnroadV2DTOModel>> {

    private TransferOnroadFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.transfer.onroad.find";
    }

    @Override
    public TransferOnroadFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferOnroadFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransferOnroadV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransferOnroadV2DTOModel>>>() {};
    }

}
