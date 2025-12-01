package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryDailyByDayV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryDailyByDayV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="434400001")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品类别代码", example="10050")
    private String categoryCode;
    @ApiCloudField(value="商品类别名称", example="果蔬")
    private String categoryName;
    @ApiCloudField(value="供应商编码", example="434400001")
    private Integer supplierNum;
    @ApiCloudField(value="数量(小数点三位)", example="1.0")
    private BigDecimal qty;
    @ApiCloudField(value="金额(小数点两位)", example="1.0")
    private BigDecimal money;
}
