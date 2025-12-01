package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentBuyDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentBuyDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="434420439")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编号", example="434420439")
    private Integer itemGradeNum;
    @ApiCloudField(value="最近进价", example="5.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="购买数量", example="0.0")
    private BigDecimal itemAmount;
    @ApiCloudField(value="明细备注", example="备注明细")
    private String itemMemo;
}
