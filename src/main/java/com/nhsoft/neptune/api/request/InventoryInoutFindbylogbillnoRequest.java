package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLogFindByLogBillNoDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemLogV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemLogV2DTOModel;

import java.util.*;

/**
 * findInventorPosItemLog请求类
 * 根据关联单据查询出入库明细
 */
public class InventoryInoutFindbylogbillnoRequest implements ApiCloudRequest<PosItemLogFindByLogBillNoDTOModel, List<PosItemLogV2DTOModel>> {

    private PosItemLogFindByLogBillNoDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inout.findbylogbillno";
    }

    @Override
    public PosItemLogFindByLogBillNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLogFindByLogBillNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemLogV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemLogV2DTOModel>>>() {};
    }

}
