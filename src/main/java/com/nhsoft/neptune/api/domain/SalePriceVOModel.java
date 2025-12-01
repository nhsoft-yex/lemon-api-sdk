package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SalePriceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SalePriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="13791380")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="2342222")
    private Integer itemGradeNum;
    @ApiCloudField(value="最后修改时间", example="2021-01-01 00:00:00")
    private String itemLastEditTime;
    @ApiCloudField(value="门店标准售价", example="10.0")
    private BigDecimal branchRegularPrice;
    @ApiCloudField(value="门店售价2", example="11.0")
    private BigDecimal branchLevel2Price;
    @ApiCloudField(value="门店售价3", example="12.0")
    private BigDecimal branchLevel3Price;
    @ApiCloudField(value="门店售价4", example="14.0")
    private BigDecimal branchLevel4Price;
    @ApiCloudField(value="门店最低售价", example="10.0")
    private BigDecimal branchMinPrice;
    @ApiCloudField(value="门店最高售价", example="20.0")
    private BigDecimal branchMaxPrice;
    @ApiCloudField(value="门店停售标记", example="true")
    private Boolean itemGradeSaleCeaseFlag;
}
