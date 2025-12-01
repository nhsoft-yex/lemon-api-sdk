package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceTicketVO模型
 * 发票VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceTicketVOModel extends ApiCloudObject {

    @ApiCloudField(value="应用类型")
    private String appType;
    @ApiCloudField(value="购买方地址")
    private String buyerAddress;
    @ApiCloudField(value="购方银行账号")
    private String buyerBankAccountNo;
    @ApiCloudField(value="开户行")
    private String buyerBankName;
    @ApiCloudField(value="购买方电话")
    private String buyerCell;
    @ApiCloudField(value="购方名称")
    private String buyerName;
    @ApiCloudField(value="购方税号（企业要填，个人可为空）")
    private String buyerTaxNum;
    @ApiCloudField(value="渠道类型")
    private String channelType;
    @ApiCloudField(value="复核人")
    private String checker;
    @ApiCloudField(value="开票员")
    private String clerk;
    @ApiCloudField(value="分机号")
    private String extensionNumber;
    @ApiCloudField(value="发票类型")
    private String invoiceType;
    @ApiCloudField(value="订单号")
    private String orderNo;
    @ApiCloudField(value="订单金额")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="收款人")
    private String payee;
    @ApiCloudField(value="收货人邮箱")
    private String receiverEmail;
    @ApiCloudField(value="收款人电话")
    private String receiverPhone;
    @ApiCloudField(value="销方名称")
    private String sellerName;
    @ApiCloudField(value="销方税号")
    private String sellerTaxNum;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="状态")
    private String status;
    @ApiCloudField(value="编码")
    private String einvoiceNum;
    @ApiCloudField(value="代码")
    private String einvoiceCode;
}
