package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderDetailVO模型
 * WMS销退订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号")
    private Integer detailNum;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="商品系统编码")
    private Integer itemNum;
    @ApiCloudField(value="商品名称")
    private String itemName;
    @ApiCloudField(value="商品代码")
    private String itemCode;
    @ApiCloudField(value="商品规格")
    private String itemSpec;
    @ApiCloudField(value="商品条码")
    private String itemBarcode;
    @ApiCloudField(value="基本单位")
    private String itemUnit;
    @ApiCloudField(value="基本单位数量（小数点3位）")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单价（小数点4位）")
    private BigDecimal itemPrice;
}
