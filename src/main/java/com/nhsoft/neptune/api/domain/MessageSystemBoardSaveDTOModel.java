package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MessageSystemBoardSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MessageSystemBoardSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="内容", example="", required=true)
    private String messageBoardContent;
    @ApiCloudField(value="主题", example="", required=true)
    private String messageBoardSubject;
    @ApiCloudField(value="发送人", example="", required=true)
    private String messageBoardSender;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="用户编号", example="", required=true)
    private List<Integer> appUserNums;
}
