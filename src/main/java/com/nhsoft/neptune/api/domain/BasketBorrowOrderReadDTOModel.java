package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasketBorrowOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasketBorrowOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="筐借还单号", required=true)
    private String basketBorrowOrderFid;
}
