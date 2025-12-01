package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ElepriceadjReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ElepriceadjReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调价申请单号", example="4344990001418", required=true)
    private String elementPriceAdjustmentFid;
}
