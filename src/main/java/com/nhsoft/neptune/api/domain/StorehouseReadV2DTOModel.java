package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StorehouseReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StorehouseReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="434400001")
    private Integer storehouseNum;
    @ApiCloudField(value="仓库代码", example="10001")
    private String storehouseCode;
}
