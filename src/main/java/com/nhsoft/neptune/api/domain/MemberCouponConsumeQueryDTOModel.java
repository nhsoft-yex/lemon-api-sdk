package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponConsumeQueryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponConsumeQueryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="核销开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="核销结束时间", required=true)
    private String dateTo;
}
