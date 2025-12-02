package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号", example="WB2030990000008")
    private String wholesaleOrderFid;
    @ApiCloudField(value="批发销售单外部单号", example="WB2030990000008")
    private String wholesaleOrderOutBillNo;
}
