package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceTicketBlueSaveDTO模型
 * 开蓝票
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceTicketBlueSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="appKey", example="AMA")
    private String appKey;
    @ApiCloudField(value="应用类型")
    private String appType;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
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
    @ApiCloudField(value="订单时间")
    private String invoiceDate;
    @ApiCloudField(value="发票类型")
    private String invoiceType;
    @ApiCloudField(value="是否是小规模纳税人")
    private Boolean isSmallTaxpayer;
    @ApiCloudField(value="订单号")
    private String orderNo;
    @ApiCloudField(value="订单来源(线上订单、线下订单)")
    private String orderSource;
    @ApiCloudField(value="订单来源(线上订单、线下订单)")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="收款人")
    private String payee;
    @ApiCloudField(value="收款人")
    private String receiverEmail;
    @ApiCloudField(value="收款人")
    private String receiverPhone;
    @ApiCloudField(value="销方银行账号")
    private String sellerAccount;
    @ApiCloudField(value="销方地")
    private String sellerAddress;
    @ApiCloudField(value="销方开户行")
    private String sellerBank;
    @ApiCloudField(value="销方电话")
    private String sellerCell;
    @ApiCloudField(value="销方名称")
    private String sellerName;
    @ApiCloudField(value="销方税号")
    private String sellerTaxNum;
    @ApiCloudField(value="小规模纳税人税率")
    private BigDecimal smallTax;
    @ApiCloudField(value="商品明细")
    private List<InvoiceTicketBlueDetailSaveDTOModel> itemDetails;
}
