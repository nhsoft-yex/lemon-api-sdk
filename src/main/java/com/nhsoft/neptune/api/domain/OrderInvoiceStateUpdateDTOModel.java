package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="订单号", example="PI99675000001", required=true)
    private String fid;
    @ApiCloudField(value="开票状态状态", required=true)
    private String state;
    @ApiCloudField(value="发票号", required=true)
    private String invoiceNo;
    @ApiCloudField(value="二维码地址")
    private String qrCodeUrl;
}
