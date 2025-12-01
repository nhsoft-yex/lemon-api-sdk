package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="发票id", example="1")
    private String orderInvoiceId;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员")
    private String orderInvoiceOperator;
    @ApiCloudField(value="操作时间", example="2023-12-18 00:00:00")
    private String orderInvoiceTime;
    @ApiCloudField(value="单据编号", example="SP2072990000053")
    private String orderInvoiceBillNo;
    @ApiCloudField(value="单据类型", example="供应商结算单")
    private String orderInvoiceType;
    @ApiCloudField(value="发票号", example="123456789")
    private String orderInvoiceNo;
    @ApiCloudField(value="发票金额", example="100")
    private BigDecimal orderInvoiceMoney;
}
