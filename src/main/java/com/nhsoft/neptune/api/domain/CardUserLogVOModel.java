package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserLogVO模型
 * 会员卡操作日志VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserLogVOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="卡操作状态", example="卡回收")
    private String cardUserLogType;
    @ApiCloudField(value="操作人", example="管理员")
    private String cardUserLogOperator;
    @ApiCloudField(value="操作时间")
    private String cardUserLogTime;
    @ApiCloudField(value="操作门店名", example="测试二店")
    private String cardUserLogBranchName;
    @ApiCloudField(value="备注", example="备注信息")
    private String cardUserLogMemo;
    @ApiCloudField(value="详情")
    private String cardUserLogContext;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="回收金额", example="1.0")
    private BigDecimal cardUserRevokeMoney;
}
