package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="", required=true)
    private List<Integer> supplierNum;
}
