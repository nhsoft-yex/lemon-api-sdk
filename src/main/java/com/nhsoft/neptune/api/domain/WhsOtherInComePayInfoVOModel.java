package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComePayInfoVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComePayInfoVOModel extends ApiCloudObject {

    @ApiCloudField(value="收款方式", example="现金")
    private String payMethod;
    @ApiCloudField(value="收款账户", example="09967920250401000001")
    private String accountId;
    @ApiCloudField(value="收款金额", example="376.0")
    private BigDecimal money;
    @ApiCloudField(value="收款备注", example="")
    private String memo;
}
