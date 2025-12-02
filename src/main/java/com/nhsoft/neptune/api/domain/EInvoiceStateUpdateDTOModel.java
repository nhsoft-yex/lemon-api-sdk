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

    @ApiCloudField(value="订单编号", example="", required=true)
    private List<String> orderNos;
    @ApiCloudField(value="开票状态(NOT_ISSUED:未开票|ISSUING:开票中|ISSUED:已开票|FAIL_ISSUED:开票失败|CANCELLING:冲红中|CANCELLED:已冲红|FAIL_CANCELLED:冲红失败)", example="NOT_ISSUED", required=true)
    private String orderInvoiceState;
    @ApiCloudField(value="开票流水号", required=true)
    private Long orderInvoiceSerialNum;
}
