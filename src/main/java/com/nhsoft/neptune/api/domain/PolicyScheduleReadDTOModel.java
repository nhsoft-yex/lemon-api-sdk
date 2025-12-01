package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyScheduleReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyScheduleReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销档期编号", example="1", required=true)
    private Long policyScheduleId;
}
