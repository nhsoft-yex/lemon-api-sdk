package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementComputeRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementComputeRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合同单据号", example="9999101003409", required=true)
    private String agreementNo;
    @ApiCloudField(value="结算起始时间", example="2022-01-01 10:00:00", required=true)
    private String settlementStartDate;
    @ApiCloudField(value="结算结束时间", example="2022-03-01 10:00:00", required=true)
    private String settlementEndDate;
    @ApiCloudField(value="结算门店编码列表（所属门店结算传99|业务发生门店传应用门店）", example="1", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="单据ID（购销合同传入前一天的收退货单据编号）", example="PI99991990002378", required=true)
    private List<String> orderNos;
}
