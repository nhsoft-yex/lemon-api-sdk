package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB2030990000004")
    private String wholesaleBookFid;
    @ApiCloudField(value="批发订单外部单号", example="WB2030990000004")
    private String wholesaleBookOutBillNo;
}
