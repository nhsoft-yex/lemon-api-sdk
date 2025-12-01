package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOtherInoutFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOtherInoutVOModel;

import com.nhsoft.neptune.api.domain.PosOtherInoutVOModel;

import java.util.*;

/**
 * findOtherInOutBizDay请求类
 * POS其他收支查询
 */
public class PosOtherinoutFindRequest implements ApiCloudRequest<PosOtherInoutFindDTOModel, List<PosOtherInoutVOModel>> {

    private PosOtherInoutFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.otherinout.find";
    }

    @Override
    public PosOtherInoutFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOtherInoutFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOtherInoutVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOtherInoutVOModel>>>() {};
    }

}
