package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserRegisterVO模型
 * 会员卡注册VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserRegisterVOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002")
    private Integer cardUserRegisterCustNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="卡操作时间")
    private String cardUserRegisterDate;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="卡操作类型", example="发卡")
    private String cardUserRegisterType;
    @ApiCloudField(value="备注", example="备注信息")
    private String cardUserRegisterMemo;
    @ApiCloudField(value="操作人", example="管理员")
    private String cardUserRegisterOperator;
}
