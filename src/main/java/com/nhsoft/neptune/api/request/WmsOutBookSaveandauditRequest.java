package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutBookSaveDTOModel;

import com.nhsoft.neptune.api.domain.WmsOutBookVOModel;

import java.util.*;

/**
 * read_4请求类
 * 出库订单新增并审核
 */
public class WmsOutBookSaveandauditRequest implements ApiCloudRequest<WmsOutBookSaveDTOModel, WmsOutBookVOModel> {

    private WmsOutBookSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.book.saveandaudit";
    }

    @Override
    public WmsOutBookSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutBookSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsOutBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsOutBookVOModel>>() {};
    }

}
