package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardOperatorRecordVO模型
 * 礼品卡操作记录VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardOperatorRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="操作日志id", example="")
    private String logId;
    @ApiCloudField(value="卡id")
    private Long cardId;
    @ApiCloudField(value="操作类型", example="")
    private String actionType;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="操作人", example="")
    private String operator;
    @ApiCloudField(value="备注", example="")
    private String memo;
    @ApiCloudField(value="门店id")
    private Integer branchId;
}
