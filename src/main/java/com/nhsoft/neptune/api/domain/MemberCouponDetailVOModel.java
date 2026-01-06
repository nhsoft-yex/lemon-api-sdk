package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponDetailVO模型
 * 会员优惠券详情VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="券id", required=true)
    private String id;
    @ApiCloudField(value="活动明细ID", required=true)
    private Integer activityDetailId;
    @ApiCloudField(value="可用结束时间")
    private String availEnd;
    @ApiCloudField(value="可用开始时间", required=true)
    private String availStart;
    @ApiCloudField(value="创建时间")
    private String createAt;
    @ApiCloudField(value="更新时间", required=true)
    private String updateAt;
    @ApiCloudField(value="条码")
    private String barcode;
    @ApiCloudField(value="条码前缀")
    private String barcodePrefix;
    @ApiCloudField(value="会员卡号")
    private String cardId;
    @ApiCloudField(value="创建门店")
    private Integer createBranchId;
    @ApiCloudField(value="创建渠道", example="AMA")
    private String createChannel;
    @ApiCloudField(value="创建单据号")
    private String createOrderNo;
    @ApiCloudField(value="创建用户中心门店编号")
    private Integer createUserCenterBranchId;
    @ApiCloudField(value="创建用户中心渠道")
    private Integer customerId;
    @ApiCloudField(value="创建用户中心单据号")
    private String memo;
    @ApiCloudField(value="券状态(CREATED)")
    private String state;
    @ApiCloudField(value="OPENID")
    private String openId;
    @ApiCloudField(value="密码")
    private String password;
    @ApiCloudField(value="手机号")
    private String phone;
    @ApiCloudField(value="售价")
    private BigDecimal salePrice;
    @ApiCloudField(value="来源")
    private String source;
    @ApiCloudField(value="券类型ID", required=true)
    private Integer typeId;
    @ApiCloudField(value="面值")
    private BigDecimal value;
    @ApiCloudField(value="券唯一标识", example="P17644219971")
    private String identity;
}
