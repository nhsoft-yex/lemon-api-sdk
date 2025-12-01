package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemStorehouseProductDateBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemStorehouseProductDateBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码（删除该门店下单商品生产日期）", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="明细", example="")
    private List<ItemStorehouseProductDateBatchSaveDetailDTOModel> details;
}
