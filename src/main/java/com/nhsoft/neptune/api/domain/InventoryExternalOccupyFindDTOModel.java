package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryExternalOccupyFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryExternalOccupyFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="单据编号", example="")
    private String orderFid;
    @ApiCloudField(value="商品编码", example="")
    private List<Integer> itemNums;
}
