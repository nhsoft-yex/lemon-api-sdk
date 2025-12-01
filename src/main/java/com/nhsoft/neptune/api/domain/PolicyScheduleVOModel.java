package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyScheduleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyScheduleVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销档期编号", example="1")
    private Long policyScheduleId;
    @ApiCloudField(value="促销档期名称", example="名称")
    private String policyScheduleName;
    @ApiCloudField(value="促销档期备注", example="备注")
    private String policyScheduleMemo;
}
