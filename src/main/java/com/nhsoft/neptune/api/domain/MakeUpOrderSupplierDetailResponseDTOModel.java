package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="211208557")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="批次号", example="18991230000543")
    private String itemLotNumber;
    @ApiCloudField(value="现库存单价", example="8.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="库存数量", example="10.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="扣补单价", example="4.0")
    private BigDecimal itemMakeUpPrice;
    @ApiCloudField(value="促销进价", example="4.0")
    private BigDecimal itemPolicyCost;
    @ApiCloudField(value="扣补金额", example="40.0")
    private BigDecimal itemMakeUpMoney;
}
