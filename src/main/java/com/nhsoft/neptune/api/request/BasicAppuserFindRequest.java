package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AppUserVOModel;

import com.nhsoft.neptune.api.domain.AppUserVOModel;

import java.util.*;

/**
 * findAppUser请求类
 * 前台用户信息查询
 */
public class BasicAppuserFindRequest implements ApiCloudRequest<AppUserFindDTOModel, List<AppUserVOModel>> {

    private AppUserFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.appuser.find";
    }

    @Override
    public AppUserFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AppUserFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AppUserVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AppUserVOModel>>>() {};
    }

}
