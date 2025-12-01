package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchSupplierAgreementFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchSupplierAgreementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合同单据号", example="9999100001", required=true)
    private String agreementNo;
}
