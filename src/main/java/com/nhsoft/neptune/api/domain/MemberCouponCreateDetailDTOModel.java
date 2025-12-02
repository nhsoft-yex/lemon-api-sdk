package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponCreateDetailDTO模型
 * 会员优惠券创建明细DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponCreateDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="活动明细ID", required=true)
    private Integer activityDetailId;
    @ApiCloudField(value="可用结束时间", example="2022-01-01 00:00:00")
    private String availEnd;
    @ApiCloudField(value="可用开始时间", example="2022-01-01 00:00:00", required=true)
    private String availStart;
    @ApiCloudField(value="条码前缀", example="")
    private String barcodePrefix;
    @ApiCloudField(value="会员卡号", example="")
    private String cardId;
    @ApiCloudField(value="创建门店")
    private Integer createBranchId;
    @ApiCloudField(value="创建渠道", example="可用值:AMA,BARB,CRM,IWM,MER,MER2,WECOM")
    private String createChannel;
    @ApiCloudField(value="创建单据号", example="")
    private String createOrderNo;
    @ApiCloudField(value="创建用户中心门店编号")
    private Integer createUserCenterBranchId;
    @ApiCloudField(value="创建用户中心渠道")
    private Integer customerId;
    @ApiCloudField(value="创建用户中心单据号", example="")
    private String memo;
    @ApiCloudField(value="OPENID", example="")
    private String openId;
    @ApiCloudField(value="密码", example="")
    private String password;
    @ApiCloudField(value="手机号", example="")
    private String phone;
    @ApiCloudField(value="售价")
    private BigDecimal salePrice;
    @ApiCloudField(value="来源", example="")
    private String source;
    @ApiCloudField(value="券类型ID", required=true)
    private Integer typeId;
    @ApiCloudField(value="面值")
    private BigDecimal value;
}
