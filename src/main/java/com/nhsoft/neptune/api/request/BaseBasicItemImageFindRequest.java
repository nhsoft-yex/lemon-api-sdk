package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseItemImageFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BaseItemImageVOModel;

import com.nhsoft.neptune.api.domain.BaseItemImageVOModel;

import java.util.*;

/**
 * find_17请求类
 * 商品档案图片查询
 */
public class BaseBasicItemImageFindRequest implements ApiCloudRequest<BaseItemImageFindDTOModel, List<BaseItemImageVOModel>> {

    private BaseItemImageFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.image.find";
    }

    @Override
    public BaseItemImageFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseItemImageFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BaseItemImageVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BaseItemImageVOModel>>>() {};
    }

}
