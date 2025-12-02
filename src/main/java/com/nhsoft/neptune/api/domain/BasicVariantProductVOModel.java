package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicVariantProductVO模型
 * 商品基础信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicVariantProductVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品id")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="是否停售", example="false")
    private Boolean stopSale;
    @ApiCloudField(value="称重标记", example="false")
    private Boolean weightingFlag;
    @ApiCloudField(value="开启总库存", example="false")
    private Boolean variantInventory;
    @ApiCloudField(value="创建时间")
    private String createdAt;
}
