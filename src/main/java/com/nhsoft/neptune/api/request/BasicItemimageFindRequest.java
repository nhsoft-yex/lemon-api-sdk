package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosImageFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosImageResponseDTOModel;

import com.nhsoft.neptune.api.domain.PosImageResponseDTOModel;

import java.util.*;

/**
 * posImageFind请求类
 * 查询商品所有图片
 */
public class BasicItemimageFindRequest implements ApiCloudRequest<PosImageFindDTOModel, List<PosImageResponseDTOModel>> {

    private PosImageFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemimage.find";
    }

    @Override
    public PosImageFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosImageFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosImageResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosImageResponseDTOModel>>>() {};
    }

}
