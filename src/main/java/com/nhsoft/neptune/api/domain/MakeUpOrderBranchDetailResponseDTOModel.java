package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderBranchDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderBranchDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="211208557")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品代码", example="00000007")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="22000007")
    private String itemBarcode;
    @ApiCloudField(value="规格", example="500ML")
    private String itemSpec;
    @ApiCloudField(value="配送单价", example="50.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="配送成本", example="40.0")
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="配送数量", example="4.0")
    private BigDecimal itemDeliveryQty;
    @ApiCloudField(value="扣补单价", example="10.0")
    private BigDecimal itemMakeUpPrice;
    @ApiCloudField(value="扣补金额", example="4370.0")
    private BigDecimal itemMakeUpMoney;
}
