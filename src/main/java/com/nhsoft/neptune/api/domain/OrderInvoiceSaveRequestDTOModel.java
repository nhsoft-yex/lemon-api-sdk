package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceSaveRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceSaveRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String orderInvoiceOperator;
    @ApiCloudField(value="单据编号", example="SP2072990000053", required=true)
    private String orderInvoiceBillNo;
    @ApiCloudField(value="单据类型", example="供应商结算单", required=true)
    private String orderInvoiceType;
    @ApiCloudField(value="发票号", example="123456789", required=true)
    private String orderInvoiceNo;
    @ApiCloudField(value="发票金额", example="100", required=true)
    private BigDecimal orderInvoiceMoney;
}
