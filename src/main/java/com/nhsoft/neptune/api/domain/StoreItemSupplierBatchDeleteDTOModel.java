package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierBatchDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierBatchDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="1", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="门店编码", example="与商品编码的乘积不能超过2000", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编码", example="与门店编码的乘积不能超过2000,不传时删除所有")
    private List<Integer> itemNums;
}
