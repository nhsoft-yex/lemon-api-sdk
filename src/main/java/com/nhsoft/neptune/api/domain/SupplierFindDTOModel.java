package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean actived;
    @ApiCloudField(value="supplier_kind")
    private String supplierKind;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="search_all")
    private Boolean searchAll;
}
