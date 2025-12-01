package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryOrderSaveDTO模型
 * 新增商城库存调整单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="类型(IN-添加库存;OUT-扣减库存;TO-库存调整至)", example="IN", required=true)
    private String direction;
    @ApiCloudField(value="备注")
    private String memo;
    @ApiCloudField(value="第三方单据号")
    private String transactionNo;
    @ApiCloudField(value="创建人", required=true)
    private String createdBy;
    @ApiCloudField(value="调整单明细", required=true)
    private List<InventoryOrderDetailSaveDTOModel> details;
}
