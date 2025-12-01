package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeSummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始时间", example="2021-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01 00:00:00", required=true)
    private String dateTo;
}
