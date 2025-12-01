package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderExtendDTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * outorderRead请求类
 * 调出单扩展字段修改
 */
public class ChainOutorderExtendUpdateRequest implements ApiCloudRequest<OutOrderExtendDTOModel, OutOrderV2DTOModel> {

    private OutOrderExtendDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.extend.update";
    }

    @Override
    public OutOrderExtendDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderExtendDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OutOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OutOrderV2DTOModel>>() {};
    }

}
