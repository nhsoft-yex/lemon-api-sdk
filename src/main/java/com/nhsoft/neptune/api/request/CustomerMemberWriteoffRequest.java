package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberWriteOffDTOModel;

import java.util.*;

/**
 * memberWriteOff请求类
 * 会员注销
 */
public class CustomerMemberWriteoffRequest implements ApiCloudRequest<MemberWriteOffDTOModel, Void> {

    private MemberWriteOffDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.writeoff";
    }

    @Override
    public MemberWriteOffDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberWriteOffDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
