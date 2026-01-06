package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeVO模型
 * 会员优惠券类型VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="券类型编号", example="11331")
    private String id;
    @ApiCloudField(value="券类型名称", example="年货大礼包")
    private String name;
    @ApiCloudField(value="券类型分类(MONEY:面值券|ITEM:商品券|DEPOSIT:储值券|DISCOUNT:折扣券|FEE:运费券)", example="MONEY")
    private String category;
    @ApiCloudField(value="消费券折扣", example="0.8")
    private BigDecimal discount;
    @ApiCloudField(value="券状态(true:启用|false:未启用)", example="true")
    private Boolean enable;
    @ApiCloudField(value="优惠券转赠", example="true")
    private Boolean supportPresent;
    @ApiCloudField(value="券面值", example="10.0")
    private BigDecimal value;
    @ApiCloudField(value="使用门槛", example="3.5")
    private BigDecimal minimum;
    @ApiCloudField(value="创建时间")
    private String createAt;
    @ApiCloudField(value="更新时间")
    private String updateAt;
    @ApiCloudField(value="售价", example="1.1")
    private BigDecimal salePrice;
    @ApiCloudField(value="券应用渠道(ONLINE,OFFLINE)", example="ONLINE")
    private List<String> scenes;
    @ApiCloudField(value="每日使用限制", example="12")
    private Integer dailyConsumeLimit;
    @ApiCloudField(value="券分组编号", example="209500000001")
    private String groupId;
    @ApiCloudField(value="券分组名称", example="抖音活动券")
    private String groupName;
    @ApiCloudField(value="券备注", example="券备注")
    private String memo;
    @ApiCloudField(value="补贴金额", example="12")
    private BigDecimal subsidyMoney;
    @ApiCloudField(value="结算比例", example="12")
    private BigDecimal settlementRatio;
    @ApiCloudField(value="活动门店", example="1")
    private List<Long> branchIds;
    @ApiCloudField(value="排除门店", example="1")
    private List<Long> exceptionBranchIds;
    @ApiCloudField(value="第三方券信息")
    private List<MemberCouponPlatformInfoVOModel> platformInfos;
}
