package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004748")
    private String requestOrderFid;
    @ApiCloudField(value="外部单号", example="YH4344010004748")
    private String requestOrderRefBillNo;
}
