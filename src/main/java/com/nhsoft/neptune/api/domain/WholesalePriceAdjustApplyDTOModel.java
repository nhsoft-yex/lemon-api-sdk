package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesalePriceAdjustApplyDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesalePriceAdjustApplyDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="4344990000318", required=true)
    private String priceAdjustmentFid;
}
