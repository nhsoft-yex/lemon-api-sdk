package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOnlineConsumeV2DTO模型
 * 会员卡线上消费V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOnlineConsumeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="实际消费金额", example="1.0", required=true)
    private BigDecimal consumeMoney;
    @ApiCloudField(value="消费操作人", example="管理员", required=true)
    private String consumeOperator;
    @ApiCloudField(value="外部编号", example="207299203630600004", required=true)
    private String outTradeNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String consumeMemo;
    @ApiCloudField(value="消费明细", example="消费明细")
    private String consumeDetail;
    @ApiCloudField(value="表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String cardPrintedNum;
    @ApiCloudField(value="赠金消费", example="0.0")
    private BigDecimal consumePresentMoney;
    @ApiCloudField(value="paycode")
    private String paycode;
    @ApiCloudField(value="consume_source")
    private String consumeSource;
    @ApiCloudField(value="是否按照consume_present_money计算赠金（默认为false，系统自动按比例计算消费赠金）", example="false")
    private Boolean posCalPresent;
}
