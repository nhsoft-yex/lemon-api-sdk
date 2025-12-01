package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderDetailDTO模型
 * 订单明细DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="行号", example="1")
    private Integer id;
    @ApiCloudField(value="商品数量", example="1")
    private BigDecimal itemCount;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="应付金额", example="103.86")
    private BigDecimal money;
    @ApiCloudField(value="实付金额", example="92.1")
    private BigDecimal paymentMoney;
}
