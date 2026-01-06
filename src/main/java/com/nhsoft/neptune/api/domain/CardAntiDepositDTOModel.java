package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardAntiDepositDTO模型
 * 会员卡反存款DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardAntiDepositDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="会员卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="反存款金额", example="1.0", required=true)
    private BigDecimal depositMoney;
    @ApiCloudField(value="支付方式", required=true)
    private String paymentType;
    @ApiCloudField(value="原存款流水号", example="207299203430590001", required=true)
    private String depositFid;
    @ApiCloudField(value="三方编号")
    private String depositBillref;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String depositOperator;
    @ApiCloudField(value="表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String cardPrintedNum;
}
