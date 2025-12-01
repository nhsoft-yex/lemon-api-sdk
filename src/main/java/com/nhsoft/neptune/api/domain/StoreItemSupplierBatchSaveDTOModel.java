package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="1", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="供货关系明细(不超过500条)", example="", required=true)
    private List<StoreItemSupplierBatchSaveDetailDTOModel> details;
}
