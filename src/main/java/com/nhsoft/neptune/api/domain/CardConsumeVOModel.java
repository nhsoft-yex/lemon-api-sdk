package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardConsumeVO模型
 * 会员卡消费VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardConsumeVOModel extends ApiCloudObject {

    @ApiCloudField(value="消费流水号", example="2072992036300016")
    private String consumeFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="22001")
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221")
    private String shiftTableBizday;
    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="消费可获得积分", example="1.0")
    private BigDecimal consumePoint;
    @ApiCloudField(value="消费折扣", example="1.0")
    private BigDecimal consumeDiscount;
    @ApiCloudField(value="消费舍出", example="1.0")
    private BigDecimal consumeRound;
    @ApiCloudField(value="实际消费金额", example="1.0")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="消费操作人", example="管理员")
    private String consumeOperator;
    @ApiCloudField(value="参考单据号", example="2072990000008")
    private String consumeBillNum;
    @ApiCloudField(value="备注", example="备注信息")
    private String consumeMemo;
    @ApiCloudField(value="消费设备号", example="C8-09-A8-B2-76-31")
    private String consumeMachine;
    @ApiCloudField(value="外部关联卡号", example="207299203630600004")
    private String consumeOrderNo;
    @ApiCloudField(value="账套号", example="4344")
    private String systemBookCode;
    @ApiCloudField(value="消费分类(1.pos消费2.线上消费.3ic卡消费)", example="1")
    private Integer consumeCategory;
    @ApiCloudField(value=" 消费类型(查询参数)", example="消费")
    private String consumeType;
    @ApiCloudField(value=" 消费前余额(查询参数)", example="1.0")
    private BigDecimal consumeBalance;
    @ApiCloudField(value=" 发票金额(查询参数)", example="1.0")
    private BigDecimal consumeInvoice;
    @ApiCloudField(value="消费时间(查询参数)", example="2021-01-21")
    private String consumeDate;
    @ApiCloudField(value="消费时间")
    private String consumeTime;
    @ApiCloudField(value=" 消费次数(查询参数)", example="1")
    private Integer consumeCount;
    @ApiCloudField(value="卡类型编号", example="99")
    private String cardUserTypeCode;
    @ApiCloudField(value="卡类型名称", example="电子卡")
    private String cardUserTypeName;
    @ApiCloudField(value="表面卡号", example="100000000666")
    private String consumePrintedNum;
}
