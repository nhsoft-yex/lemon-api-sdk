package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientGradeItemVO模型
 * 客户等级价格
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientGradeItemVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户等级编号", example="20720001")
    private Integer clientGradeNum;
    @ApiCloudField(value="商品编码", example="20720001")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="990005")
    private String itemCode;
    @ApiCloudField(value="商品单位", example="斤")
    private String itemUnit;
    @ApiCloudField(value="进货价", example="5.0")
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="批发价", example="20.0")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="批发毛利", example="15.0")
    private BigDecimal itemWholesaleGross;
    @ApiCloudField(value="客户商品等级价格", example="15.0")
    private BigDecimal itemClientGradePrice;
    @ApiCloudField(value="加点类型(1 不加点 2 按比率 3 按金额)", example="1")
    private Integer itemClientGrossType;
    @ApiCloudField(value="加点值", example="0.05")
    private BigDecimal itemClientGrossValue;
    @ApiCloudField(value="建议零售价", example="121.0")
    private BigDecimal posItemRegularPrice;
    @ApiCloudField(value="允许在线批发", example="true")
    private Boolean itemClientGradeSaleCase;
}
