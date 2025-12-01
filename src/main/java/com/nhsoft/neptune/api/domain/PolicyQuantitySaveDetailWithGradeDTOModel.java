package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyQuantitySaveDetailWithGradeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyQuantitySaveDetailWithGradeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434419403", required=true)
    private Integer itemNum;
    @ApiCloudField(value="分级明细编号", example="21")
    private Integer itemGradeNum;
    @ApiCloudField(value="特价价格", example="5.0", required=true)
    private BigDecimal itemSpecialPrice;
    @ApiCloudField(value="起始数量", example="0", required=true)
    private BigDecimal itemMinAmount;
    @ApiCloudField(value="明细备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="每单限量", example="5.0")
    private BigDecimal itemBillLimit;
    @ApiCloudField(value="阶梯价1(阶梯范围超量特价生效)")
    private BigDecimal itemLadderPrice1;
    @ApiCloudField(value="阶梯价2(阶梯范围超量特价生效)")
    private BigDecimal itemLadderPrice2;
    @ApiCloudField(value="阶梯价3(阶梯范围超量特价生效)")
    private BigDecimal itemLadderPrice3;
}
