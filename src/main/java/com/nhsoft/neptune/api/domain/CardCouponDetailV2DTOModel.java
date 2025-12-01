package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponDetailV2DTO模型
 * 会员卡消费券详情V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="券可用开始时间", example="2022-01-23 00:00:00", required=true)
    private String availableTimeFrom;
    @ApiCloudField(value="券可用结束时间", example="2022-03-23 00:00:00", required=true)
    private String availableTimeTo;
    @ApiCloudField(value="券代码", example="093118551668", required=true)
    private String barcode;
    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="消费时间", example="2022-03-21 00:00:00", required=true)
    private String consumeTime;
    @ApiCloudField(value="获取时间", example="2022-01-23 00:00:00", required=true)
    private String createTime;
    @ApiCloudField(value="消费门店名称", example="测试门店1", required=true)
    private String consumeBranchName;
    @ApiCloudField(value="消费门店编码", example="1", required=true)
    private Integer consumeBranchNum;
    @ApiCloudField(value="券创建门店名称", example="管理中心", required=true)
    private String createBranchName;
    @ApiCloudField(value="券创建门店编码", example="99", required=true)
    private Integer createBranchNum;
    @ApiCloudField(value="券创建渠道", example="AMA", required=true)
    private String createChannel;
    @ApiCloudField(value="券核销渠道", example="AMA", required=true)
    private String consumeChannel;
    @ApiCloudField(value="创建单据号", example="207201220822440002", required=true)
    private String createOrderNo;
    @ApiCloudField(value="券编号", example="2555397", required=true)
    private Integer couponNum;
    @ApiCloudField(value="券备注", example="备注", required=true)
    private String memo;
    @ApiCloudField(value="电话号码", example="15789520211", required=true)
    private String phone;
    @ApiCloudField(value="拉动单据金额", example="10.4", required=true)
    private BigDecimal relateOrderMoney;
    @ApiCloudField(value="消费券面值", example="10.4", required=true)
    private BigDecimal value;
    @ApiCloudField(value="coupon_type", required=true)
    private CardCouponTypeDTOModel couponType;
    @ApiCloudField(value="消费券类型编号", example="7604", required=true)
    private Integer typeId;
    @ApiCloudField(value="会员名称", example="张三", required=true)
    private String customerName;
    @ApiCloudField(value="会员编号", example="20145", required=true)
    private String customerId;
}
