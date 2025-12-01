package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyMoneyDateToUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyMoneyDateToUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="超额奖励结束日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyMoneyDateTo;
    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
}
