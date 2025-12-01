package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketSendDetailSimpleDTO模型
 * 票据发送详情简单DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketSendDetailSimpleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券标志", example="N15LLX284KFRCY6972KT80OQW5VMQDVK")
    private String ticketSendDetailUuid;
    @ApiCloudField(value="营销活动标志", example="MA2072990000012")
    private String actionId;
    @ApiCloudField(value="消费券券号", example="98001201931170003")
    private String ticketSendDetailPrintNum;
    @ApiCloudField(value="消费券面值", example="1.0")
    private BigDecimal ticketSendDetailValue;
    @ApiCloudField(value="消费券折扣", example="0.5")
    private BigDecimal ticketSendDiscount;
    @ApiCloudField(value="消费券有效截止日期", example="2020-05-27")
    private String ticketSendDetailValidDate;
    @ApiCloudField(value="消费券类型名称", example="5元券")
    private String ticketSendDetailType;
    @ApiCloudField(value="消费券条码", example="98991810440004")
    private String ticketSendBarCode;
    @ApiCloudField(value="消费券备注", example="备注信息")
    private String ticketSendDetailMemo;
    @ApiCloudField(value="消费券应用分类", example="消费折扣券")
    private String ticketCategory;
    @ApiCloudField(value="消费券可用起始时间", example="2020-08-22")
    private String ticketSendDetailValidStart;
    @ApiCloudField(value="消费券发放门店名称", example="管理中心")
    private String ticketSendDetailSendBranchName;
    @ApiCloudField(value="最低消费金额（前台控制）", example="1.0")
    private BigDecimal ticketLimitMoney;
    @ApiCloudField(value="超额张数累加（前台控制）", example="false")
    private Boolean ticketLimitAmountLoop;
    @ApiCloudField(value="不允许和其它消费券同时使用（前台控制）", example="false")
    private Boolean ticketUsedSelf;
    @ApiCloudField(value="促销特价商品不支持抵扣（前台控制）", example="false")
    private Boolean exceptPromotionItems;
    @ApiCloudField(value="使用限制张数（前台控制）", example="1")
    private Integer ticketLimitAmount;
    @ApiCloudField(value="消费券状态码(1-启用；3-已消费；5-作废)", example="1")
    private Integer ticketSendStateCode;
    @ApiCloudField(value="消费券过期状态(可用|已过期|已消费|未生效|作废)", example="可用")
    private String ticketValidStateName;
    @ApiCloudField(value="消费券发放门店编码", example="99")
    private Integer ticketSendBranchNum;
    @ApiCloudField(value="最高抵用金额金额", example="1.0")
    private BigDecimal ticketMaxUseMoney;
    @ApiCloudField(value="允许支付方式", example="现金,银联卡,第三方在线支付")
    private String paymentTypes;
    @ApiCloudField(value="消费券类型代码", example="10")
    private String ticketSendDetailTypeCode;
    @ApiCloudField(value="券中心活动ID", example="1")
    private Long couponActionDetailId;
    @ApiCloudField(value="消费券发放时间", example="2020-08-23 10:35:40.109")
    private String ticketSendDetailSendTime;
    @ApiCloudField(value="消费券核销时间", example="2020-08-23 10:35:40")
    private String ticketSendDetailUseTime;
}
