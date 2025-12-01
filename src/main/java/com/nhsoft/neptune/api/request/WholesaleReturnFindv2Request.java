package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnFindV2ReqModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnFind_1请求类
 * 批发退货单查询
 */
public class WholesaleReturnFindv2Request implements ApiCloudRequest<WholesaleReturnFindV2ReqModel, List<WholesaleReturnVOModel>> {

    private WholesaleReturnFindV2ReqModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.find/v2";
    }

    @Override
    public WholesaleReturnFindV2ReqModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnFindV2ReqModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>>() {};
    }

}
