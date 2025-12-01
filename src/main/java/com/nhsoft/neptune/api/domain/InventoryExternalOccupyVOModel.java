package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryExternalOccupyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryExternalOccupyVOModel extends ApiCloudObject {

    @ApiCloudField(value="库存占用id", example="")
    private String inventoryExternalOccupyId;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="单据编号", example="")
    private String orderFid;
    @ApiCloudField(value="占用时间", example="")
    private String updateTime;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="占用库存数量")
    private BigDecimal inventoryExternalOccupyAmount;
    @ApiCloudField(value="批次号", example="")
    private String lotNumber;
}
