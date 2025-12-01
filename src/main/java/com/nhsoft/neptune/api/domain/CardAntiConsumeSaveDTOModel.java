package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardAntiConsumeSaveDTO模型
 * 会员卡反消费保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardAntiConsumeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="退款门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="退款操作人", example="管理员", required=true)
    private String consumeOperator;
    @ApiCloudField(value="原消费流水号", example="2072992036300016", required=true)
    private String consumeFid;
    @ApiCloudField(value="退款金额", example="1.0", required=true)
    private BigDecimal consumeMoney;
    @ApiCloudField(value="关联单据号", example="207299203630600003")
    private String consumeBillNum;
    @ApiCloudField(value="表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String cardPrintedNum;
}
