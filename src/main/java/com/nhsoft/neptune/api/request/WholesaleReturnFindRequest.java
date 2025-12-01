package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnFindReqModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnFind请求类
 * 批发退货单查询
 */
public class WholesaleReturnFindRequest implements ApiCloudRequest<WholesaleReturnFindReqModel, List<WholesaleReturnVOModel>> {

    private WholesaleReturnFindReqModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.find";
    }

    @Override
    public WholesaleReturnFindReqModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnFindReqModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>>() {};
    }

}
