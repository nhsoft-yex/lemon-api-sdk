package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayRecordVO模型
 * 客户支付记录VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="订单号")
    private String billNo;
    @ApiCloudField(value="操作时间")
    private String billTime;
    @ApiCloudField(value="操作人")
    private String operator;
    @ApiCloudField(value="会员ID")
    private Long customerId;
    @ApiCloudField(value="会员手机号")
    private String customerPhone;
    @ApiCloudField(value="会员姓名")
    private String customerName;
    @ApiCloudField(value="会员等级ID")
    private Long levelId;
    @ApiCloudField(value="会员等级名")
    private String levelName;
    @ApiCloudField(value="金额")
    private BigDecimal money;
    @ApiCloudField(value="实付金额")
    private BigDecimal receivedAmount;
    @ApiCloudField(value="应付金额")
    private BigDecimal receivableAmount;
    @ApiCloudField(value="是否退款")
    private Boolean ifRefund;
    @ApiCloudField(value="支付方式")
    private String paymentType;
    @ApiCloudField(value="有效天数")
    private Integer days;
    @ApiCloudField(value="渠道流水号")
    private String transactionNo;
    @ApiCloudField(value="到期时间")
    private String expireTime;
    @ApiCloudField(value="退款金额")
    private BigDecimal refundAmount;
    @ApiCloudField(value="退款时间")
    private String refundTime;
    @ApiCloudField(value="线下门店ID")
    private Integer branchNum;
    @ApiCloudField(value="主键id")
    private Long id;
    @ApiCloudField(value="用户中心门店id")
    private Integer branchId;
    @ApiCloudField(value="门店名称")
    private String branchName;
    @ApiCloudField(value="购卡类别")
    private String kind;
    @ApiCloudField(value="开始生效时间")
    private String startTime;
    @ApiCloudField(value="状态")
    private String state;
    @ApiCloudField(value="主卡id")
    private Long parentId;
    @ApiCloudField(value="会员生日")
    private String birth;
    @ApiCloudField(value="会员消费金额")
    private BigDecimal customerTotalConsumeMoney;
    @ApiCloudField(value="作废时间")
    private String disableTime;
}
