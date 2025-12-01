package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustCouponDepositReportV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustCouponDepositReportV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="管理中心")
    private String branchName;
    @ApiCloudField(value="营业日", example="20220615")
    private String shiftTableBizday;
    @ApiCloudField(value="售券数量", example="4")
    private Integer purchaseActionCount;
    @ApiCloudField(value="销券金额", example="40.0")
    private BigDecimal purchaseActionMoney;
    @ApiCloudField(value="退券数量", example="1")
    private Integer returnActionCount;
    @ApiCloudField(value="退券金额", example="-10.0")
    private BigDecimal returnActionMoney;
    @ApiCloudField(value="实际售券数量", example="3")
    private Integer actualActionCount;
    @ApiCloudField(value="实际售券金额", example="30.0")
    private BigDecimal actualActionMoney;
}
