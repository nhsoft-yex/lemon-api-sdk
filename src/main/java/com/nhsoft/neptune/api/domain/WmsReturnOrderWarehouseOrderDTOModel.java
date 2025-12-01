package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderWarehouseOrderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderWarehouseOrderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="入库单编号", example="RK996589924166000002", required=true)
    private String warehouseOrderFid;
    @ApiCloudField(value="wms销退订单编号", example="XTDD21139924067000001")
    private String returnOrderFid;
}
