package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BatchUpdateSettlementDTOModel;

import java.util.*;

/**
 * updateOutOrderUseQty请求类
 * 要货单批量付款确认
 */
public class ChainRequestBatchSettlementstateUpdateRequest implements ApiCloudRequest<BatchUpdateSettlementDTOModel, Void> {

    private BatchUpdateSettlementDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.batch.settlementstate.update";
    }

    @Override
    public BatchUpdateSettlementDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BatchUpdateSettlementDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
