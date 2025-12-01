package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleRefundOrderDetailV2VO模型
 * 退款订单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleRefundOrderDetailV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer num;
    @ApiCloudField(value="商品编码", example="676916")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="标准单价", example="1.0")
    private BigDecimal itemStdPrice;
    @ApiCloudField(value="实际单价", example="1.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="退款数量", example="1.0")
    private BigDecimal amount;
    @ApiCloudField(value="基本数量", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="退款金额", example="1.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="单位", example="盒")
    private String itemUnit;
    @ApiCloudField(value="商品属性", example="商品属性")
    private String productAttribute;
}
