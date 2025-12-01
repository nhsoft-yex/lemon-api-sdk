package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSaleListDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSaleListDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="类别名称", example="水果")
    private String itemCategoryName;
    @ApiCloudField(value="商品销售数量", example="1.0")
    private BigDecimal totalAmount;
    @ApiCloudField(value="商品销售额", example="1.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="商品成本价", example="0.5")
    private BigDecimal costMoney;
}
