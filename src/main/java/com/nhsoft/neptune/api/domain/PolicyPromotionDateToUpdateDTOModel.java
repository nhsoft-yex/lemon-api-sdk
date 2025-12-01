package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionDateToUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionDateToUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销特价结束日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String policyPromotionDateTo;
    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
}
