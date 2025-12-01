package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierShareRegionV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierShareRegionV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="434400001")
    private Integer supplierNum;
    @ApiCloudField(value="区域编号", example="1")
    private Integer regionNum;
}
