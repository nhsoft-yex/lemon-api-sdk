package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleOrderDetailV2VO模型
 * 订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleOrderDetailV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer num;
    @ApiCloudField(value="商品编码", example="676916")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="标准售价", example="1.0")
    private BigDecimal itemStdPrice;
    @ApiCloudField(value="实际售价", example="1.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="单位", example="盒")
    private String itemUnit;
    @ApiCloudField(value="数量", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="折扣金额", example="1.0")
    private BigDecimal discountMoney;
    @ApiCloudField(value="应收金额", example="1.0")
    private BigDecimal paymentMoney;
    @ApiCloudField(value="商品属性", example="商品属性")
    private String productAttribute;
    @ApiCloudField(value="基本单位数量转化率", example="5.0")
    private BigDecimal itemRate;
}
