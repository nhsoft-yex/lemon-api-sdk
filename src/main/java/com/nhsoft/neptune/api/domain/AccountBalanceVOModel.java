package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountBalanceVO模型
 * 账户余额
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountBalanceVOModel extends ApiCloudObject {

    @ApiCloudField(value="记账户余额", example="10.0")
    private BigDecimal amount;
    @ApiCloudField(value="冻结金额", example="5.0")
    private BigDecimal frozenAmount;
}
