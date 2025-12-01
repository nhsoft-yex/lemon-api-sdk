package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentReadRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentReadRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="付款单号;", example="SP2072990000053", required=true)
    private String paymentNo;
}
