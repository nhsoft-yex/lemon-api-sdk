package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="销退订单编号", example="XTDD21139922193000131", required=true)
    private String returnOrderFid;
    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
}
