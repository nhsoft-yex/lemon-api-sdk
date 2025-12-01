package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="出库订单编号", example="CD21139924113000001", required=true)
    private String outWarehouseBookOrderFid;
}
