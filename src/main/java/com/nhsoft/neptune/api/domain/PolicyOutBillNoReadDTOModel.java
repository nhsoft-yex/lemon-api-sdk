package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyOutBillNoReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyOutBillNoReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="外部单号(促销单号二选一)", example="")
    private String policyOutBillNo;
    @ApiCloudField(value="促销单号(外部单号二选一)", example="")
    private String policyNo;
}
