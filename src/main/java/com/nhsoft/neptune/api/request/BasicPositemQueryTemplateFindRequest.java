package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemQueryTemplateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemQueryTemplateDTOModel;

import com.nhsoft.neptune.api.domain.PosItemQueryTemplateDTOModel;

import java.util.*;

/**
 * findPosItemQueryTemplate请求类
 * 商品查询模板查询
 */
public class BasicPositemQueryTemplateFindRequest implements ApiCloudRequest<PosItemQueryTemplateFindDTOModel, List<PosItemQueryTemplateDTOModel>> {

    private PosItemQueryTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.positem.query.template.find";
    }

    @Override
    public PosItemQueryTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemQueryTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemQueryTemplateDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemQueryTemplateDTOModel>>>() {};
    }

}
