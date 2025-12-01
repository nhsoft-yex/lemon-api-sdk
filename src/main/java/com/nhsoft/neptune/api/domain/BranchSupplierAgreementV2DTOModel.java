package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchSupplierAgreementV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchSupplierAgreementV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="合同单据号", example="9999100001")
    private String agreementNo;
    @ApiCloudField(value="结算日期", example="2022-01-01")
    private String settlementDate;
}
