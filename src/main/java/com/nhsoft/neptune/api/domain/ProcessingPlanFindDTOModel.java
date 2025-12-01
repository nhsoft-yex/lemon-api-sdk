package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="时间类型(制单时间|审核时间|截止时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="业务员", example="业务员")
    private String operator;
}
