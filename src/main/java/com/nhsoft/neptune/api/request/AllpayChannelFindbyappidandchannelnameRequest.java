package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayChannelFindDTOModel;

import java.util.*;

/**
 * findAllByAppidAndChannelName请求类
 * 根据渠道名称查询渠道
 */
public class AllpayChannelFindbyappidandchannelnameRequest implements ApiCloudRequest<PayChannelFindDTOModel, Object> {

    private PayChannelFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.channel.findbyappidandchannelname";
    }

    @Override
    public PayChannelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayChannelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
