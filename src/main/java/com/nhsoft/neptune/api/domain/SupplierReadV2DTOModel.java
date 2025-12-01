package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码（合作伙伴ID二选一）", example="43440001")
    private Integer supplierNum;
    @ApiCloudField(value="合作伙伴ID（供应商编码二选一）", example="129")
    private Long userCenterPartnerId;
}
