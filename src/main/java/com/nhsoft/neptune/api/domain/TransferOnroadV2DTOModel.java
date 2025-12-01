package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferOnroadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferOnroadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="4344000001")
    private Integer itemNum;
    @ApiCloudField(value="配送在途数量", example="100.0")
    private BigDecimal itemTransferOnLoadQty;
    @ApiCloudField(value="调出数量", example="200.0")
    private BigDecimal itemTransferOutQty;
    @ApiCloudField(value="调入数量", example="100.0")
    private BigDecimal itemTransferInQty;
}
