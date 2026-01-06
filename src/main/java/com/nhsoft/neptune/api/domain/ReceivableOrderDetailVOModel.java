package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceivableOrderDetailVO模型
 * 应收单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceivableOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="物料编号", example="C00008002229")
    private String itemNum;
    @ApiCloudField(value="物料名称", example="运费")
    private String itemName;
    @ApiCloudField(value="物料代码", example="2101496")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="70592")
    private String itemBarcode;
    @ApiCloudField(value="物料税收编号")
    private String itemInvoiceCode;
    @ApiCloudField(value="规格", example="10公斤/箱")
    private String itemSpec;
    @ApiCloudField(value="单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="单价", example="10")
    private BigDecimal itemPrice;
    @ApiCloudField(value="数量", example="10")
    private BigDecimal quantity;
    @ApiCloudField(value="金额", example="100.0")
    private BigDecimal amount;
    @ApiCloudField(value="已开票金额", example="100.0")
    private BigDecimal alreadyInvoiceAmount;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal discountAmount;
    @ApiCloudField(value="折扣率", example="0.0")
    private BigDecimal discountRate;
    @ApiCloudField(value="原始金额", example="100.0")
    private BigDecimal initialAmount;
    @ApiCloudField(value="发票金额", example="100.0")
    private BigDecimal invoiceAmount;
    @ApiCloudField(value="不含税金额", example="0.0")
    private BigDecimal noTaxAmount;
    @ApiCloudField(value="税率", example="0.0")
    private BigDecimal taxRate;
    @ApiCloudField(value="税额", example="0.0")
    private BigDecimal taxAmount;
}
