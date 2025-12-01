package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiCardDepositSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiCardDepositSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="管理中心")
    private String branchName;
    @ApiCloudField(value="营业日", example="20220324")
    private String shiftTableBizday;
    @ApiCloudField(value="首存付款金额", example="40.0")
    private BigDecimal firstPaymentMoney;
    @ApiCloudField(value="首充存款金额", example="40.0")
    private BigDecimal firstDepositMoney;
    @ApiCloudField(value="首充次数", example="1")
    private BigDecimal firstDepositCount;
}
