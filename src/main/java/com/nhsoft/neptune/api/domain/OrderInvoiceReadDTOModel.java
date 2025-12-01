package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="123456789", required=true)
    private String orderNo;
}
