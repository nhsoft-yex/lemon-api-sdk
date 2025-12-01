package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookCarrierFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsOutBookCarrierVOModel;

import com.nhsoft.neptune.api.domain.WmsOutBookCarrierVOModel;

import java.util.*;

/**
 * findCarrierByBookFids请求类
 * 根据出库订单编号查询承运商信息
 */
public class WmsOutBookCarrierFindRequest implements ApiCloudRequest<WmsOutBookCarrierFindDTOModel, List<WmsOutBookCarrierVOModel>> {

    private WmsOutBookCarrierFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.carrier.find";
    }

    @Override
    public WmsOutBookCarrierFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutBookCarrierFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsOutBookCarrierVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsOutBookCarrierVOModel>>>() {};
    }

}
