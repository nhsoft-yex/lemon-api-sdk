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

    @ApiCloudField(value="message_board_content", required=true)
    private String messageBoardContent;
    @ApiCloudField(value="message_board_subject", required=true)
    private String messageBoardSubject;
    @ApiCloudField(value="message_board_sender", required=true)
    private String messageBoardSender;
    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="app_user_nums", required=true)
    private List<Integer> appUserNums;
}
