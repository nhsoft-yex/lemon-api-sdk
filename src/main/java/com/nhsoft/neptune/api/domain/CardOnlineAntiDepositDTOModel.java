package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOnlineAntiDepositDTO模型
 * 会员卡线上反存款DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOnlineAntiDepositDTOModel extends ApiCloudObject {

    @ApiCloudField(value="反存款流水编号", example="207299203430590001")
    private String depositFid;
    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="反存款前余额", example="1.0")
    private BigDecimal depositBalance;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String depositPrintedNum;
    @ApiCloudField(value="卡类型代码", example="99")
    private Integer depositCardType;
    @ApiCloudField(value="存款类型", example="存款")
    private String depositType;
    @ApiCloudField(value="存款时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-21 00:00:00")
    private String depositDate;
    @ApiCloudField(value="关联单据号", example="207299203630600003")
    private String depositBillref;
}
