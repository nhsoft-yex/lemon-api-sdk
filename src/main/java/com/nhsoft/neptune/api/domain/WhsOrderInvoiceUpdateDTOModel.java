package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOrderInvoiceUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOrderInvoiceUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="WO2030990000008", required=true)
    private String fid;
    @ApiCloudField(value="发票号", example="123456789", required=true)
    private String invoiceNo;
    @ApiCloudField(value="发票状态")
    private Integer ticketStatus;
    @ApiCloudField(value="单据状态(ISSUED|FAIL_ISSUED|ISSUING|NOT_ISSUED|CANCELLED)", example="ISSUED")
    private String whsOrderDocumentStatus;
    @ApiCloudField(value="发票链接", example="https://www.baidu.com")
    private String einvoiceUrl;
}
