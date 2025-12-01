package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPriceVO模型
 * 批发价格
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="7107")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="00006")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="测试商品")
    private String itemName;
    @ApiCloudField(value="基本单位", example="公斤")
    private String baseUnit;
    @ApiCloudField(value="商品批发价格", example="13.0")
    private BigDecimal itemWholesalePrice;
    @ApiCloudField(value="POS商品抵扣数量")
    private BigDecimal posItemOffsetQty;
    @ApiCloudField(value="POS商品倍数")
    private BigDecimal posItemMultiple;
    @ApiCloudField(value="POS商品上限数量")
    private BigDecimal posItemUpperQty;
    @ApiCloudField(value="批发销售启用状态")
    private String wholesaleSaleEnable;
    @ApiCloudField(value="商品规格编号")
    private String itemSpecNum;
    @ApiCloudField(value="规格价格")
    private BigDecimal specPrice;
    @ApiCloudField(value="自定义消息")
    private String customMessage;
}
