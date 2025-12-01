package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCostPriceUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCostPriceUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102200551", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品成本价", example="20.0", required=true)
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="操作人编号", example="1")
    private Integer appUserNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String appUserName;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
}
