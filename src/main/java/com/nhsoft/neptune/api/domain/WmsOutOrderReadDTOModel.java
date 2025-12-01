package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="出库单号", example="CK21139924113000001", required=true)
    private String outWarehouseOrderFid;
}
