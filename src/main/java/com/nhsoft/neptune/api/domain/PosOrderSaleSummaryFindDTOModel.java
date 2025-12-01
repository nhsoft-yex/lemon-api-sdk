package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderSaleSummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderSaleSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业日", example="1", required=true)
    private String shiftTableBizday;
    @ApiCloudField(value="销售门店", example="1", required=true)
    private Integer branchNum;
}
