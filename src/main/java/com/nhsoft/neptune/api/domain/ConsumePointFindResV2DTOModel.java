package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ConsumePointFindResV2DTO模型
 * 消费积分查询结果V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConsumePointFindResV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="4000")
    private Integer shiftTableNum;
    @ApiCloudField(value="营业日", example="20230307")
    private String shiftTableBizday;
    @ApiCloudField(value="卡编码", example="144")
    private Integer consumePointCustNum;
    @ApiCloudField(value="当前积分余额", example="100")
    private BigDecimal consumePointBalance;
    @ApiCloudField(value="消耗积分", example="10")
    private BigDecimal consumePointPoint;
    @ApiCloudField(value="操作人", example="admin")
    private String consumePointOperator;
    @ApiCloudField(value="备注", example="text")
    private String consumePointMemo;
    @ApiCloudField(value="消费时间")
    private String consumePointDate;
    @ApiCloudField(value="上传时间")
    private String consumeSynchDate;
    @ApiCloudField(value="外部单号", example="207201200850003")
    private String consumePointRefBillNo;
    @ApiCloudField(value="商品编码", example="20720001")
    private Integer consumePointItemNum;
    @ApiCloudField(value="仓库号", example="207200003")
    private Integer consumePointStorehouseNum;
    @ApiCloudField(value="兑换数量", example="1")
    private BigDecimal consumePointAmount;
    @ApiCloudField(value="商品名称", example="测试商品")
    private String consumePointItemName;
    @ApiCloudField(value="兑换类型(积分兑换物品|积分兑券|积分合并|积分转储值)", example="")
    private String consumePointType;
    @ApiCloudField(value="兑换成本", example="100")
    private BigDecimal consumePointCost;
    @ApiCloudField(value="兑换金额", example="100")
    private BigDecimal consumePointPrice;
    @ApiCloudField(value="积分兑换单号", example="22081500")
    private String pointOrderFid;
    @ApiCloudField(value="全渠道会员身份ID", example="207200232173")
    private String customerId;
    @ApiCloudField(value="活动维护主键", example="207201191900001")
    private String consumePointFid;
}
