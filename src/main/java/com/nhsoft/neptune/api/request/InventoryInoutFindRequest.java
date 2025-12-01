package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLogFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemLogV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemLogV2DTOModel;

import java.util.*;

/**
 * findInventorPosItemLog_1请求类
 * 出入库明细查询
 */
public class InventoryInoutFindRequest implements ApiCloudRequest<PosItemLogFindDTOModel, List<PosItemLogV2DTOModel>> {

    private PosItemLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inout.find";
    }

    @Override
    public PosItemLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemLogV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemLogV2DTOModel>>>() {};
    }

}
