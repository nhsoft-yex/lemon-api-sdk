package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentDateToUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentDateToUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="赠品促销结束日期（yyyy-MM-dd）", example="2021-01-01", required=true)
    private String policyPresentDateTo;
    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
}
