package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品名称", example="")
    private String pointOrderDetailItemName;
    @ApiCloudField(value="积分要求")
    private BigDecimal pointOrderDetailPoint;
    @ApiCloudField(value="兑换数量")
    private BigDecimal pointOrderDetailAmount;
    @ApiCloudField(value="兑换金额")
    private BigDecimal pointOrderDetailMoney;
    @ApiCloudField(value="兑换总量")
    private BigDecimal pointOrderDetailTotalAmount;
    @ApiCloudField(value="单人兑换数量")
    private BigDecimal pointOrderDetailOneAmount;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码")
    private Integer itemGradeNum;
}
