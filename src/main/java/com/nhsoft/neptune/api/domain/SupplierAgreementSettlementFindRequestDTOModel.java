package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementSettlementFindRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementSettlementFindRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结算门店编码列表", example="99")
    private List<Integer> branchNums;
    @ApiCloudField(value="供应商编码列表", example="434400001")
    private List<Integer> supplierNums;
    @ApiCloudField(value="时间类型(制单时间，审核时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
