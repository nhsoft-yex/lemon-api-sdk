package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemMaterialFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemWithMaterialVOModel;

import com.nhsoft.neptune.api.domain.PosItemWithMaterialVOModel;

import java.util.*;

/**
 * findPosItemMaterial请求类
 * 物料清单查询
 */
public class PositemMaterialFindRequest implements ApiCloudRequest<PosItemMaterialFindDTOModel, List<PosItemWithMaterialVOModel>> {

    private PosItemMaterialFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.positem.material.find";
    }

    @Override
    public PosItemMaterialFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemMaterialFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemWithMaterialVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemWithMaterialVOModel>>>() {};
    }

}
