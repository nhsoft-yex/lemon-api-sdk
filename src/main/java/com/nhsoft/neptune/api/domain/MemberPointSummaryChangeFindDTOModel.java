package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPointSummaryChangeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPointSummaryChangeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-10 00:00:00", required=true)
    private String dateTo;
}
