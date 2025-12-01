package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WarehouseOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="入库单编号", example="RK21139924098000006", required=true)
    private String warehouseOrderFid;
    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
}
