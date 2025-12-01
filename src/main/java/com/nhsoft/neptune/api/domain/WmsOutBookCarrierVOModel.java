package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookCarrierVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookCarrierVOModel extends ApiCloudObject {

    @ApiCloudField(value="出库订单号", example="CD21139924113000001")
    private String outWarehouseBookOrderFid;
    @ApiCloudField(value="承运商编码", example="10001")
    private String carrierNo;
}
