package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderKitDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderKitDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="207210313")
    private Integer itemNum;
    @ApiCloudField(value="商品组合明细数量（小数点3位）", example="11.0")
    private BigDecimal orderKitDetailQty;
    @ApiCloudField(value="商品组合单价（小数点4位）", example="50.0")
    private BigDecimal orderKitDetailPrice;
    @ApiCloudField(value="商品组合金额（小数点2位）", example="550.0")
    private BigDecimal orderKitDetailMoney;
    @ApiCloudField(value="商品组合成本（小数点2位）", example="21.5")
    private BigDecimal orderKitDetailCost;
    @ApiCloudField(value="经营方式", example="联营")
    private String managementStyleType;
    @ApiCloudField(value="供应商编码", example="434400001")
    private Integer supplierNum;
}
