package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BatchUpdateSettlementDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BatchUpdateSettlementDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="[YH434420000001]", required=true)
    private List<String> orderFids;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
