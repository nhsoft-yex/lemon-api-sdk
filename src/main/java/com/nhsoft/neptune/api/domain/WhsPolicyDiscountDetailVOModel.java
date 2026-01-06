package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPolicyDiscountDetailVO模型
 * 折扣明细(指定类别、全场时为例外商品)
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPolicyDiscountDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1", required=true)
    private Integer wholesalePolicyDiscountDetailNum;
    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品规格编号", example="1")
    private Long itemSpecNum;
    @ApiCloudField(value="商品价格", example="10", required=true)
    private BigDecimal wholesalePolicyDiscountDetailPrice;
    @ApiCloudField(value="商品备注", example="备注")
    private String wholesalePolicyDiscountDetailMemo;
}
