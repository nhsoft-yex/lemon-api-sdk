package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveOrderFindDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveOrderFindDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434402943")
    private Integer itemNum;
    @ApiCloudField(value="预定上限（小数点3位）", example="1.1")
    private BigDecimal upperLimit;
    @ApiCloudField(value="预定下限（小数点3位）", example="1.1")
    private BigDecimal lowerLimit;
    @ApiCloudField(value="预定基数（小数点2位）", example="1.1")
    private BigDecimal baseAmount;
    @ApiCloudField(value="配送促销类型")
    private Integer discountPriceType;
    @ApiCloudField(value="特价/折扣(0-1)（小数点2位）", example="0.9")
    private BigDecimal discountValue;
    @ApiCloudField(value="门店促销价（小数点2位）", example="1.23")
    private BigDecimal discountSalePrice;
    @ApiCloudField(value="是否必订，false不必订，true必订", example="true")
    private Boolean boundFlag;
}
