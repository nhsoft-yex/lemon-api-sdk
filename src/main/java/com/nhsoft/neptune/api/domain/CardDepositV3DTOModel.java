package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositV3DTO模型
 * 会员卡存款响应参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡存款单据编号", example="207299203430590001")
    private String depositFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="会员卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="关联单据号", example="207299203630600003")
    private String depositBillref;
    @ApiCloudField(value="存款前余额", example="1.0")
    private BigDecimal depositBalance;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String depositPrintedNum;
    @ApiCloudField(value="卡类型代码", example="99")
    private Integer depositCardType;
    @ApiCloudField(value="存款分类", example="存款")
    private String depositType;
    @ApiCloudField(value="存款时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String depositDate;
}
