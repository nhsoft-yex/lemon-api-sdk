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
    @ApiCloudField(value="应用类型", example="")
    private String appType;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
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
    @ApiCloudField(value="订单时间", example="")
    private String invoiceDate;
    @ApiCloudField(value="发票类型", example="")
    private String invoiceType;
    @ApiCloudField(value="是否是小规模纳税人", example="false")
    private Boolean isSmallTaxpayer;
    @ApiCloudField(value="订单号", example="")
    private String orderNo;
    @ApiCloudField(value="订单来源(线上订单、线下订单)", example="")
    private String orderSource;
    @ApiCloudField(value="订单来源(线上订单、线下订单)")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="收款人", example="")
    private String payee;
    @ApiCloudField(value="收款人", example="")
    private String receiverEmail;
    @ApiCloudField(value="收款人", example="")
    private String receiverPhone;
    @ApiCloudField(value="销方银行账号", example="")
    private String sellerAccount;
    @ApiCloudField(value="销方地", example="")
    private String sellerAddress;
    @ApiCloudField(value="销方开户行", example="")
    private String sellerBank;
    @ApiCloudField(value="销方电话", example="")
    private String sellerCell;
    @ApiCloudField(value="销方名称", example="")
    private String sellerName;
    @ApiCloudField(value="销方税号", example="")
    private String sellerTaxNum;
    @ApiCloudField(value="小规模纳税人税率")
    private BigDecimal smallTax;
    @ApiCloudField(value="商品明细", example="")
    private List<InvoiceTicketBlueDetailSaveDTOModel> itemDetails;
}
