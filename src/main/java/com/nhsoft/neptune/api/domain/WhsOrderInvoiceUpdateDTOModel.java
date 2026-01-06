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

    @ApiCloudField(value="单据号", required=true)
    private String fid;
    @ApiCloudField(value="发票号", required=true)
    private String invoiceNo;
    @ApiCloudField(value="发票状态 0=失败 1=成功 2=开票中")
    private Integer ticketStatus;
    @ApiCloudField(value="单据状态")
    private String whsOrderDocumentStatus;
    @ApiCloudField(value="发票链接")
    private String einvoiceUrl;
}
