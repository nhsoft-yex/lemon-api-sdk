package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentSaveDetailWithGradeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentSaveDetailWithGradeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434420439", required=true)
    private Integer itemNum;
    @ApiCloudField(value="促销价格", example="25", required=true)
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="赠送数量", example="1", required=true)
    private BigDecimal itemSaleAmount;
    @ApiCloudField(value="购买数量", example="1")
    private BigDecimal itemBuyAmount;
    @ApiCloudField(value="可购上限", example="8", required=true)
    private BigDecimal itemSaleLimit;
    @ApiCloudField(value="明细备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="总数量上限", example="8")
    private BigDecimal itemQuantityLimit;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
}
