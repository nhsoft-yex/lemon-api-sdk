package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MessageSystemBoardSaveDTOModel;

import java.util.*;

/**
 * sendMessage_1请求类
 * 留言板发送消息
 */
public class BasicSendSystemMessageRequest implements ApiCloudRequest<MessageSystemBoardSaveDTOModel, Object> {

    private MessageSystemBoardSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.send.system.message";
    }

    @Override
    public MessageSystemBoardSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MessageSystemBoardSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
