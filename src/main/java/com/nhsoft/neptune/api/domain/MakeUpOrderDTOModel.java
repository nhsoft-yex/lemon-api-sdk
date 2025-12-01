package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="扣补单单号", example="BM43440000002")
    private String makeUpOrderFid;
    @ApiCloudField(value="供应商编码", example="4344000001")
    private Integer supplierNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="4344000001")
    private Integer storehouseNum;
    @ApiCloudField(value="扣补金额（小数点两位）", example="100.0")
    private BigDecimal makeUpMoney;
    @ApiCloudField(value="已结金额（小数点两位）", example="100.0")
    private BigDecimal makeUpPaidMoney;
    @ApiCloudField(value="开始日期", example="2021-01-01")
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2021-01-01")
    private String dateTo;
    @ApiCloudField(value="状态编码", example="1")
    private Integer makeUpStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String makeUpStateName;
    @ApiCloudField(value="付款日期", example="2021-01-01 10:00:00")
    private String paymentDate;
    @ApiCloudField(value="创建人", example="管理员")
    private String makeUpCreator;
    @ApiCloudField(value="创建时间", example="2021-01-01 10:00:00")
    private String makeUpCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String makeUpAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-01 10:00:00")
    private String makeUpAuditTime;
}
