package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_no", required=true)
    private String orderNo;
}
