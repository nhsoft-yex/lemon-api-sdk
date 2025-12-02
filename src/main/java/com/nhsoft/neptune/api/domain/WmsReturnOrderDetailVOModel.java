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

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="仓库编号", example="1")
    private Integer storehouseNum;
    @ApiCloudField(value="商品系统编码", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="aaa")
    private String itemName;
    @ApiCloudField(value="商品代码", example="A0001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1*3个")
    private String itemSpec;
    @ApiCloudField(value="商品条码", example="A0001")
    private String itemBarcode;
    @ApiCloudField(value="基本单位", example="个")
    private String itemUnit;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单价（小数点4位）", example="1")
    private BigDecimal itemPrice;
}
