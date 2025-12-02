package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ConsumePointV2DTO模型
 * 消费积分V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConsumePointV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="4000", required=true)
    private Integer shiftTableNum;
    @ApiCloudField(value="交班日期", example="20230307", required=true)
    private String shiftTableBizday;
    @ApiCloudField(value="卡编码", example="144", required=true)
    private Integer consumePointCustNum;
    @ApiCloudField(value="当前积分余额", example="100", required=true)
    private BigDecimal consumePointBalance;
    @ApiCloudField(value="消耗积分", example="10", required=true)
    private BigDecimal consumePointPoint;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String consumePointOperator;
    @ApiCloudField(value="备注", example="")
    private String consumePointMemo;
    @ApiCloudField(value="外部单号", example="")
    private String consumePointRefBillNo;
    @ApiCloudField(value="商品编码", example="20720001")
    private Integer consumePointItemNum;
    @ApiCloudField(value="仓库号")
    private Integer consumePointStorehouseNum;
    @ApiCloudField(value="兑换数量", example="1")
    private BigDecimal consumePointAmount;
    @ApiCloudField(value="商品名称", example="测试商品")
    private String consumePointItemName;
    @ApiCloudField(value="兑换类型(积分兑换物品|积分兑券|积分合并|积分转储值)", example="", required=true)
    private String consumePointType;
    @ApiCloudField(value="兑换金额")
    private BigDecimal consumePointPrice;
    @ApiCloudField(value="积分兑换单号", example="")
    private String pointOrderFid;
    @ApiCloudField(value="是否同步线上（默认为false）", example="false")
    private Boolean online;
}
