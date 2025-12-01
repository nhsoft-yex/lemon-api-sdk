package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CurrentAccountPayDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CurrentAccountPayDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="")
    private String branchName;
    @ApiCloudField(value="配送中心编号")
    private Integer centerBranchNum;
    @ApiCloudField(value="配送中心名称", example="")
    private String centerBranchName;
    @ApiCloudField(value="上期应收")
    private BigDecimal lastDueMoney;
    @ApiCloudField(value="应收金额")
    private BigDecimal dueMoney;
    @ApiCloudField(value="已收金额")
    private BigDecimal actualDueMoney;
    @ApiCloudField(value="优惠金额")
    private BigDecimal discountMoney;
    @ApiCloudField(value="未收金额")
    private BigDecimal notDueMoney;
    @ApiCloudField(value="期内应收累计")
    private BigDecimal totalDueMoney;
    @ApiCloudField(value="应收累计")
    private BigDecimal totalNowDueMoney;
    @ApiCloudField(value="信用额度")
    private BigDecimal branchCreditLimit;
    @ApiCloudField(value="信用余额")
    private BigDecimal branchCreditBalance;
}
