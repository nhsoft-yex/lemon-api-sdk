package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportApiSaleAndInventorySummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportApiSaleAndInventorySummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="门店1")
    private String branchName;
    @ApiCloudField(value="商品编号", example="43440001")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="43440001")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="43440001")
    private String itemBarcode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="销售数量", example="100")
    private BigDecimal saleTotalAmount;
    @ApiCloudField(value="销售金额", example="100")
    private BigDecimal saleTotalMoney;
    @ApiCloudField(value="库存数量", example="100")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="库存金额", example="100")
    private BigDecimal inventoryMoney;
    @ApiCloudField(value="收货次数", example="100")
    private Long receiveCount;
    @ApiCloudField(value="收货数量", example="100")
    private BigDecimal receiveTotalQty;
    @ApiCloudField(value="收货金额", example="100")
    private BigDecimal receiveTotalMoney;
}
