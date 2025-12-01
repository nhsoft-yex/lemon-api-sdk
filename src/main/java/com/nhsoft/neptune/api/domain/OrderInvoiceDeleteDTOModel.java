package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="发票id", example="123456789", required=true)
    private String orderInvoiceId;
}
