package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentFindRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentFindRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结算门店;", example="99")
    private Integer branchNum;
    @ApiCloudField(value="时间类型(制单时间，审核时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="单据号", example="SP2072990000035")
    private String orderFid;
    @ApiCloudField(value="现金银行", example="207200001")
    private Integer accountBankNum;
    @ApiCloudField(value="审核状态", example="3")
    private Integer stateCode;
    @ApiCloudField(value="供应商", example="")
    private List<Integer> supplierNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
