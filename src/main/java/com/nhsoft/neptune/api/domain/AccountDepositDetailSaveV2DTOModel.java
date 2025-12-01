package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountDepositDetailSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDepositDetailSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="收款用途", example="用途", required=true)
    private String detailDepositResource;
    @ApiCloudField(value="收款金额（小数点2位）", example="1.1", required=true)
    private BigDecimal detailDepositMoney;
    @ApiCloudField(value="备注", example="备注1")
    private String detailDepositMemo;
}
