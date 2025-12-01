package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="合同单据号", example="207200001", required=true)
    private String agreementNo;
}
