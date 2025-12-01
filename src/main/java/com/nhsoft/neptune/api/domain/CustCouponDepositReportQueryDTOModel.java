package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustCouponDepositReportQueryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustCouponDepositReportQueryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店列表", example="[99 , 1]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-03", required=true)
    private String dateTo;
}
