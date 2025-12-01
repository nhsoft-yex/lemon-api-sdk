package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardAntiConsumeVO模型
 * 会员卡反消费VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardAntiConsumeVOModel extends ApiCloudObject {

    @ApiCloudField(value="退款门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="原消费流水号", example="2072992036300016")
    private String consumeFid;
    @ApiCloudField(value="营业日（yyyyMMdd）", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="关联单据号", example="207299203630600003")
    private String consumeBillNum;
    @ApiCloudField(value="退款前余额", example="1.0")
    private BigDecimal consumeBalance;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String consumePrintedNum;
    @ApiCloudField(value="卡类型代码", example="89")
    private Integer consumeCardType;
    @ApiCloudField(value="消费分类", example="消费")
    private String consumeType;
    @ApiCloudField(value="消费时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-21 00:00:00")
    private String consumeDate;
}
