package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseStorematrixReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseStorematrixReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="207200001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="仓库编码", example="207200001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="查询范围门店编码（用于要货数量）", example="207200001", required=true)
    private List<Integer> branchNums;
}
