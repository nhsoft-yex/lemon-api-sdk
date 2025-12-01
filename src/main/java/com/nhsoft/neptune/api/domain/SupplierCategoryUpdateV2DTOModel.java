package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierCategoryUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierCategoryUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商类型代码", example="01", required=true)
    private String supplierCategoryCode;
    @ApiCloudField(value="供应商类型名称", example="南京供应商", required=true)
    private String supplierCategoryName;
}
