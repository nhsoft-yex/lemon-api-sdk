package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountDepositDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDepositDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="收款用途", example="用途")
    private String detailDepositResource;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.1")
    private BigDecimal detailDepositMoney;
    @ApiCloudField(value="备注", example="备注1")
    private String detailDepositMemo;
}
