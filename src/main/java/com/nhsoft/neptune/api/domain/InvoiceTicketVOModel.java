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

    @ApiCloudField(value="应用类型", example="")
    private String appType;
    @ApiCloudField(value="购买方地址", example="")
    private String buyerAddress;
    @ApiCloudField(value="购方银行账号", example="")
    private String buyerBankAccountNo;
    @ApiCloudField(value="开户行", example="")
    private String buyerBankName;
    @ApiCloudField(value="购买方电话", example="")
    private String buyerCell;
    @ApiCloudField(value="购方名称", example="")
    private String buyerName;
    @ApiCloudField(value="购方税号（企业要填，个人可为空）", example="")
    private String buyerTaxNum;
    @ApiCloudField(value="渠道类型", example="")
    private String channelType;
    @ApiCloudField(value="复核人", example="")
    private String checker;
    @ApiCloudField(value="开票员", example="")
    private String clerk;
    @ApiCloudField(value="分机号", example="")
    private String extensionNumber;
    @ApiCloudField(value="发票类型", example="")
    private String invoiceType;
    @ApiCloudField(value="订单号", example="")
    private String orderNo;
    @ApiCloudField(value="订单金额")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="收款人", example="")
    private String payee;
    @ApiCloudField(value="收货人邮箱", example="")
    private String receiverEmail;
    @ApiCloudField(value="收款人电话", example="")
    private String receiverPhone;
    @ApiCloudField(value="销方名称", example="")
    private String sellerName;
    @ApiCloudField(value="销方税号", example="")
    private String sellerTaxNum;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="状态", example="")
    private String status;
    @ApiCloudField(value="编码", example="")
    private String einvoiceNum;
    @ApiCloudField(value="代码", example="")
    private String einvoiceCode;
}
