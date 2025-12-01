package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderMatrixFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOrderMatrixV2DTOModel;

import com.nhsoft.neptune.api.domain.PosOrderMatrixV2DTOModel;

import java.util.*;

/**
 * findPosOrderMatrix请求类
 * 销售单扩展数据查询
 */
public class PosOrderMatrixFindRequest implements ApiCloudRequest<PosOrderMatrixFindV2DTOModel, List<PosOrderMatrixV2DTOModel>> {

    private PosOrderMatrixFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.matrix.find";
    }

    @Override
    public PosOrderMatrixFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderMatrixFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOrderMatrixV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOrderMatrixV2DTOModel>>>() {};
    }

}
