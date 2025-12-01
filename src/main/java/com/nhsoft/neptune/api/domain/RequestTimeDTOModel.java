package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="部门名称或类别代码", example="99")
    private String name;
    @ApiCloudField(value="要货开始时段", example="99")
    private String requestTimeFrom;
    @ApiCloudField(value="要货结束时段", example="99")
    private String requestTimeTo;
    @ApiCloudField(value="星期(周一到周日：1,2,3,4,5,6,7,)", example="99")
    private String requestPeriodDays;
}
