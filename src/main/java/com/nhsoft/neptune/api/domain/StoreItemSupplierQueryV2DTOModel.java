package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemSupplierQueryV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemSupplierQueryV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后修改时间", example="2022-01-01 10:00:00", required=true)
    private String lastEditTime;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
}
