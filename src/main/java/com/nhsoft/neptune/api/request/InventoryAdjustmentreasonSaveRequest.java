package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.AdjustmentReasonSaveDTOModel;

import com.nhsoft.neptune.api.domain.AdjustmentReasonSaveDTOModel;

import java.util.*;

/**
 * adjustmentReasonSave请求类
 * 批量保存调整原因
 */
public class InventoryAdjustmentreasonSaveRequest implements ApiCloudRequest<List<AdjustmentReasonSaveDTOModel>, Void> {

    private List<AdjustmentReasonSaveDTOModel> bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustmentreason.save";
    }

    @Override
    public List<AdjustmentReasonSaveDTOModel> getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(List<AdjustmentReasonSaveDTOModel> bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
