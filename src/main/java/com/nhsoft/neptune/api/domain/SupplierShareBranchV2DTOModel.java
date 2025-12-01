package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierShareBranchV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierShareBranchV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="434400001")
    private Integer supplierNum;
    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
}
