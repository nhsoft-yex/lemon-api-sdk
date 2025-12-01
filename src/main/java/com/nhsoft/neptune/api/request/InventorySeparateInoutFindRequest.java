package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemLogSeparateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemLogSeparateV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemLogSeparateV2DTOModel;

import java.util.*;

/**
 * findInventorSeparateLog请求类
 * 分割品出入库明细查询
 */
public class InventorySeparateInoutFindRequest implements ApiCloudRequest<PosItemLogSeparateFindDTOModel, List<PosItemLogSeparateV2DTOModel>> {

    private PosItemLogSeparateFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.separate.inout.find";
    }

    @Override
    public PosItemLogSeparateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemLogSeparateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemLogSeparateV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemLogSeparateV2DTOModel>>>() {};
    }

}
