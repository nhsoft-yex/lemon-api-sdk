package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeOperateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeOperateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="折扣码编号", example="", required=true)
    private String discountCodeNo;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
