package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOnlineDepositV2DTO模型
 * 会员卡线上存款V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOnlineDepositV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="存款金额", example="1.0", required=true)
    private BigDecimal depositMoney;
    @ApiCloudField(value="实际存款金额", example="1.0", required=true)
    private BigDecimal depositCash;
    @ApiCloudField(value="外部编号", example="207299203630600004", required=true)
    private String outTradeNo;
    @ApiCloudField(value="支付类型", example="现金", required=true)
    private String paymentType;
    @ApiCloudField(value="表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String cardPrintedNum;
}
