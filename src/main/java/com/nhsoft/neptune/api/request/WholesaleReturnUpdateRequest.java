package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnUpdate请求类
 * 批发退货单修改
 */
public class WholesaleReturnUpdateRequest implements ApiCloudRequest<WholesaleReturnUpdateDTOModel, WholesaleReturnVOModel> {

    private WholesaleReturnUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.update";
    }

    @Override
    public WholesaleReturnUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleReturnVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleReturnVOModel>>() {};
    }

}
