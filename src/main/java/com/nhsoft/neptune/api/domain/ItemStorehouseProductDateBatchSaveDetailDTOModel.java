package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemStorehouseProductDateBatchSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemStorehouseProductDateBatchSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="20720001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码", example="20720001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="生产日期", example="2023-04-01 00:00:00", required=true)
    private String productDate;
}
