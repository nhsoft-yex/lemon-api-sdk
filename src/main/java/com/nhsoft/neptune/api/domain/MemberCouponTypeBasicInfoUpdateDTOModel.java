package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeBasicInfoUpdateDTO模型
 * 优惠券类型基础信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeBasicInfoUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="券类型名称", example="年货大礼包", required=true)
    private String name;
    @ApiCloudField(value="券类型分类(MONEY:面值券|ITEM:商品券|DEPOSIT:储值券|DISCOUNT:折扣券|FEE:运费券|DOORSILL:指定门槛券)", example="MONEY", required=true)
    private String category;
    @ApiCloudField(value="券面值", example="10.0", required=true)
    private BigDecimal value;
    @ApiCloudField(value="折扣率", example="0.5")
    private BigDecimal discount;
    @ApiCloudField(value="随机金额标记", example="true")
    private Boolean randomValueFlag;
    @ApiCloudField(value="随机金额面值券的最小面值", example="1.0")
    private BigDecimal randomMiniValue;
    @ApiCloudField(value="使用门槛", example="3.5")
    private BigDecimal minimum;
    @ApiCloudField(value="售价", example="1.1")
    private BigDecimal salePrice;
    @ApiCloudField(value="结算比例", example="1")
    private BigDecimal settlementRatio;
    @ApiCloudField(value="补贴金额", example="12")
    private BigDecimal subsidyMoney;
    @ApiCloudField(value="每日使用限制(不填无限制)", example="0")
    private Integer dailyConsumeLimit;
    @ApiCloudField(value="商品券折扣比例", example="1.0")
    private BigDecimal itemCouponDiscount;
    @ApiCloudField(value="券状态(true:启用|false:未启用)", example="true", required=true)
    private Boolean enable;
    @ApiCloudField(value="券分组编号", example="209500000001")
    private String groupId;
    @ApiCloudField(value="优惠券转赠", example="true")
    private Boolean supportPresent;
    @ApiCloudField(value="券应用渠道(ONLINE,OFFLINE)", example="ONLINE", required=true)
    private List<String> scenes;
    @ApiCloudField(value="券备注", example="券备注")
    private String memo;
    @ApiCloudField(value="活动门店", example="1")
    private List<Long> branchIds;
    @ApiCloudField(value="例外门店", example="[1]")
    private List<Long> exceptionBranchIds;
    @ApiCloudField(value="券id(等同ticket_code)", example="", required=true)
    private String id;
}
