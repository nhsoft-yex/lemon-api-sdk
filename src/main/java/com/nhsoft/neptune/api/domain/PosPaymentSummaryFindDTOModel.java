package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosPaymentSummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosPaymentSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="[1,2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="开始时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
}
