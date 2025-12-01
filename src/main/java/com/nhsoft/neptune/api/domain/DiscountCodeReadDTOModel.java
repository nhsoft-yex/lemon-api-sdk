package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="折扣码编号", example="", required=true)
    private String discountCodeNo;
}
