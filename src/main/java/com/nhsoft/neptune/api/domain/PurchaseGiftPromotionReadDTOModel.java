package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseGiftPromotionReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseGiftPromotionReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="采购赠品促销单号", example="2072990000018", required=true)
    private String purchaseGiftPromotionNo;
}
