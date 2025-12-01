package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="1")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="是否启用价格", example="false")
    private Boolean storeMatrixPriceEnabled;
    @ApiCloudField(value="门店零售价", example="1.0")
    private BigDecimal storeMatrixRegularPrice;
    @ApiCloudField(value="门店二级价格", example="1.0")
    private BigDecimal storeMatrixLevel2Price;
    @ApiCloudField(value="门店三级价格", example="1.0")
    private BigDecimal storeMatrixLevel3Price;
    @ApiCloudField(value="门店四级价格", example="1.0")
    private BigDecimal storeMatrixLevel4Price;
    @ApiCloudField(value="门店最低售价", example="1.0")
    private BigDecimal storeMatrixMinPrice;
    @ApiCloudField(value="门店最高售价", example="1.0")
    private BigDecimal storeMatrixMaxPrice;
    @ApiCloudField(value="是否停用", example="false")
    private Boolean storeMatrixStockCeaseFlag;
    @ApiCloudField(value="是否销售", example="false")
    private Boolean storeMatrixSaleCeaseFlag;
    @ApiCloudField(value="门店配送价", example="1.0")
    private BigDecimal storeMatrixTransferPrice;
    @ApiCloudField(value="是否允许经营", example="true")
    private Boolean storeMatrixManage;
    @ApiCloudField(value="最后修改时间")
    private String storeMatrixLastEditTime;
}
