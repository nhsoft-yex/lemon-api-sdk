package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutOrderAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutOrderAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="出库单号", example="CK21139924113000001", required=true)
    private String outWarehouseOrderFid;
}
