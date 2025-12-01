package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPromotionReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPromotionReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="99675990000854", required=true)
    private String promotionNo;
}
