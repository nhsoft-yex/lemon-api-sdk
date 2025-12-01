package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardConsumeReadByOrderNoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardConsumeReadByOrderNoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="销售单号", example="207299203630600004", required=true)
    private String orderNo;
}
