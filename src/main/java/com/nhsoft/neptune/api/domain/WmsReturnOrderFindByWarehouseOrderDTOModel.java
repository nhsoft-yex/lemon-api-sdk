package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderFindByWarehouseOrderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderFindByWarehouseOrderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="入库单编号列表", example="[RK996589924166000002]", required=true)
    private List<String> warehouseOrderFids;
}
