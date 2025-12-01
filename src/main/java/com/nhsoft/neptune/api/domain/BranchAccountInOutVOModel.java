package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchAccountInOutVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchAccountInOutVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="门店一")
    private String branchName;
    @ApiCloudField(value="账户类型", example="卡储值账户")
    private String accountType;
    @ApiCloudField(value="期初余额", example="0.0")
    private BigDecimal beginningBalance;
    @ApiCloudField(value="充值", example="0.0")
    private BigDecimal depositMoney;
    @ApiCloudField(value="pos存款", example="0.0")
    private BigDecimal posDepositMoney;
    @ApiCloudField(value="pos扣款", example="0.0")
    private BigDecimal posConsumeMoney;
    @ApiCloudField(value="预存款", example="0.0")
    private BigDecimal preDepositMoney;
    @ApiCloudField(value="期末余额", example="0.0")
    private BigDecimal closingBalance;
}
