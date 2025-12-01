package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * EInvoiceStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EInvoiceStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_nos", required=true)
    private List<String> orderNos;
    @ApiCloudField(value="order_invoice_state", required=true)
    private String orderInvoiceState;
    @ApiCloudField(value="order_invoice_serial_num", required=true)
    private Long orderInvoiceSerialNum;
}
