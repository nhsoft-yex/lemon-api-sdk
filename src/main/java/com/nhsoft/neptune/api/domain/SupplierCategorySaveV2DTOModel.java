package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierCategorySaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierCategorySaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商类型代码", example="01")
    private String supplierCategoryCode;
    @ApiCloudField(value="供应商类型名称", example="南京供应商")
    private String supplierCategoryName;
    @ApiCloudField(value="上级目录类型代码", example="02")
    private String supplierCategoryParentCode;
}
