package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RetailPosOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RetailPosOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="main", required=true)
    private RetailPosOrderMainSaveDTOModel main;
    @ApiCloudField(value="单据明细", example="", required=true)
    private List<RetailPosOrderDetailSaveDTOModel> details;
    @ApiCloudField(value="支付明细", example="", required=true)
    private List<RetailPosOrderPaymentSaveDTOModel> payments;
}
