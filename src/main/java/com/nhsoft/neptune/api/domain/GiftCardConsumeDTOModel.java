package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeDTO模型
 * 礼品卡消费DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业日")
    private String shiftTableBizday;
    @ApiCloudField(value="销售终端ID")
    private String terminalId;
    @ApiCloudField(value="消费时间")
    private String consumeTime;
    @ApiCloudField(value="礼品卡Id", example="1", required=true)
    private Long cardId;
    @ApiCloudField(value="来源(WECHAT_OFFICIAL:公众号/微商城|WECHAT_MP:小程序|WECHAT_PAY:微信支付|ALIPAY_PAY:支付宝支付|MANUAL:导入/新增|OFFLINE:线下开卡|WECOM:企业微信|OMS:企业微信|ALI_MP:第三方平台|TIK_TOK:TIK_TOK)", example="WECHAT_PAY", required=true)
    private String source;
    @ApiCloudField(value="关联单号", required=true)
    private String relationOrderNo;
    @ApiCloudField(value="消费总金额", example="100", required=true)
    private BigDecimal totalConsumeMoney;
    @ApiCloudField(value="操作人", example="营业员")
    private String operator;
    @ApiCloudField(value="备注")
    private String memo;
    @ApiCloudField(value="班次号")
    private String shiftTableNum;
    @ApiCloudField(value="用户中心门店ID", example="1")
    private Integer branchId;
    @ApiCloudField(value="乐檬零售线下门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="客户ID")
    private String customerId;
    @ApiCloudField(value="关联支付号")
    private String relationPaymentNo;
}
